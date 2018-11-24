
import java.util.Scanner;

public class Hangman {

    private static String[] words = {"terminator", "banana", "computer", "cow", "rain", "water", "wait", "release", "river",
        "important", "mark", "electric", "defective", "poke", "blue", "beef", "spring", "hurt", "orange", "happy", "zealous", "flowery", "accurate", "brake", "title", "x-ray", "festive",
        "wrathful", "scissors", "peaceful", "finicky", "shape", "soothe", "head", "spotted", "needless", "time", "abundant", "humdrum", "mouth", "trot", "bounce", "thank", "avoid", "shocking",
        "minor", "secret", "rabbit", "protect", "honey", "business", "worthless", "suggest", "splendid", "drab", "safe", "gigantic", "arrive", "drum", "hate", "dinosaurs", "machine", "tame",
        "annoy", "telephone", "curtain", "monkey", "things", "refuse", "lunch", "wooden", "ruin", "request", "faded", "camp", "didactic", "annoying", "finger", "acrid", "overt", "lamp",
        "paste", "rejoice", "ignorant", "exist", "madly", "doubt", "increase", "measly", "mate", "tangy", "dislike", "bikes", "rambunctious", "complete", "motion", "coast", "air", "obey",
        "burst", "nosy", "consist", "yellow", "long", "cakes", "close", "teaching", "five", "undesirable", "squash", "border", "memorize", "fowl", "scarecrow", "tie", "present", "well-to-do",
        "meaty", "wonderful", "pencil", "need", "advice", "wide-eyed", "apologize", "possible", "dreary", "skin", "kick", "stage", "tongue", "puffy", "camp", "ski", "ghost", "quickest",
        "lip", "frequent", "one", "efficient", "angry", "alleged", "suit", "notebook", "wipe", "dream", "spark", "work", "pail", "throne", "unnatural", "pale", "brief", "pets", "ad hoc",
        "overrated", "house", "rely", "messy", "pastoral", "afternoon", "enchanting", "tense", "army", "spotless", "button", "good", "reduce", "leather", "eye", "spotty", "growth", "alert",
        "statement", "overflow", "flame", "disagree", "whispering", "lively", "healthy", "sedate", "plant", "melt", "snatch", "combative", "grain", "spurious", "run", "fuzzy", "hot", "large",
        "exotic", "woozy", "unaccountable", "zip", "wren", "courageous", "match", "form", "comb", "shut", "pointless", "languid", "capricious", "stop", "mammoth", "psychedelic", "ordinary",
        "cobweb", "determined", "stereotyped", "sordid", "arrest", "inquisitive", "carpenter", "small", "vivacious", "guard", "poor", "funny", "shaky", "hilarious", "egg", "spiders",
        "abounding", "humor", "sticky", "plastic", "ratty", "productive", "agree", "fork", "temper", "prepare", "whistle", "responsible", "drain", "eight", "nest", "slow", "loutish", "saw",
        "fear", "scrub", "volatile", "moldy", "attract", "receptive", "aberrant", "neck", "man", "store", "materialistic", "shrug", "billowy", "driving", "travel", "fairies", "lumpy",
        "assorted", "bow", "babies", "attend", "dress", "surprise", "tranquil", "marvelous", "illustrious", "clam", "fact", "plate", "soft", "cover", "dad", "trousers", "cars", "superficial",
        "bawdy", "drown", "envious", "wasteful", "religion", "bells", "kick", "announce", "elastic", "trap", "smoggy", "lively", "serious", "start", "lavish", "basin", "wrench", "lock",
        "picture", "hand", "rail", "delightful", "trade", "sand", "face", "tenuous", "scream", "produce", "low", "subtract", "industrious", "pass", "station", "wash", "synonymous", "red",
        "wrong", "warlike", "low", "contain", "mailbox", "liquid", "expensive", "string", "time", "open", "admit", "lettuce", "decision", "quixotic", "towering", "copy", "better", "cake",
        "fluffy", "yarn", "grease", "mountainous", "stick", "join", "icicle", "succinct", "plastic", "pear", "acoustic", "abrupt", "position", "spark", "yak", "bent", "crook", "kitty",
        "sneaky", "use", "pollution", "mundane", "barbarous", "delight", "flesh", "robin", "party", "milky", "round", "wretched", "pleasant", "treatment", "winter", "hot", "available",
        "train", "writer", "prose", "furtive", "building", "cattle", "wealthy", "sassy", "sponge", "face", "reflective", "bear", "wanting", "bustling", "wiry", "tearful", "hypnotic", "ill",
        "animated", "verdant", "toad", "unlock", "long-term", "wall", "direful", "hunt", "obtainable", "walk", "bleach", "unarmed", "happen", "kiss", "trick", "queen", "conscious", "mourn",
        "girls", "frame", "erect", "secretary", "field", "helpful", "science", "crown", "heady", "grotesque", "dress", "degree", "cushion", "piquant", "innate", "square", "cactus",
        "tricky", "company", "remarkable", "calculate", "rinse", "crime", "push", "mind", "flagrant", "man", "permit", "theory", "thoughtful", "crate", "yummy", "offbeat", "paltry", "bulb",
        "optimal", "stove", "chemical", "shallow", "merciful", "sore", "abortive", "perpetual", "zonked", "eyes", "bore", "tired", "regret", "fit", "potato", "confuse", "childlike", "vein",
        "sound", "attack", "exchange", "back", "check", "damaged", "grandmother", "division", "groovy", "throat", "office", "pin", "stare", "meddle", "shivering", "interfere", "occur",
        "hole", "sugar", "test", "blind", "free", "perform", "cherries", "flavor", "stupendous", "purpose", "extend", "risk", "fanatical", "grubby", "beg", "romantic", "outrageous",
        "swift", "bath", "room", "pocket", "front", "flower", "quicksand", "mark", "sturdy", "resolute", "letters", "expert", "hapless", "bloody", "hope", "chew"};
    private static String word = words[(int) (Math.random() * words.length)];
    private static String asterisk = new String(new char[word.length()]).replace("\0", "*");
    private static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (count < 7 && asterisk.contains("*")) {
            System.out.println("Guess any letter in the word");
            System.out.println(asterisk);
            System.out.print(">> ");
            String guess = sc.next();
            hang(guess);
        }
        sc.close();
    }

    public static void hang(String guess) {
        String newasterisk = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess.charAt(0)) {
                newasterisk += guess.charAt(0);
            } else if (asterisk.charAt(i) != '*') {
                newasterisk += word.charAt(i);
            } else {
                newasterisk += "*";
            }
        }

        if (asterisk.equals(newasterisk)) {
            count++;
            hangmanImage();
        } else {
            asterisk = newasterisk;
        }
        if (asterisk.equals(word)) {
            System.out.println("Correct! You win! The word was " + word);
        }
    }

    public static void hangmanImage() {
        if (count == 1) {
            System.out.println("Wrong guess, try again");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("___|___");
            System.out.println();
        }
        if (count == 2) {
            System.out.println("Wrong guess, try again");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (count == 3) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   | ");
            System.out.println("___|___");
        }
        if (count == 4) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (count == 5) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (count == 6) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");
        }
        if (count == 7) {
            System.out.println("GAME OVER!");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |          _|_");
            System.out.println("   |         / | \\");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");
            System.out.println("GAME OVER! The word was " + word);
        }
    }
}

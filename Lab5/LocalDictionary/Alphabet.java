import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.*;


public class Alphabet {

    public static String[] aWords = {"Apple", "Adventure", "Atmosphere", "Acoustic", "Alligator", "Amethyst", "Avocado", "Astonish", "Astronomy", "Abundant"};
    public static String[] bWords = {"Banana", "Brave", "Breeze", "Bubble", "Blossom", "Balloon", "Beacon", "Ballet", "Bonsai", "Blissful"};
    public static String[] cWords = {"Cactus", "Cascade", "Crisp", "Calm", "Charm", "Celestial", "Cello", "Cerulean", "Cherish", "Cinnamon"};
    public static String[] dWords = {"Dazzle", "Delight", "Dolphin", "Dream", "Dewdrop", "Diamond", "Dusk", "Divine", "Dainty", "Dragonfly"};
    public static String[] eWords = {"Eagle", "Eclipse", "Elegant", "Enchant", "Emerald", "Endless", "Essence", "Evergreen", "Exquisite", "Ephemeral"};
    public static String[] fWords = {"Fairy", "Flame", "Fiesta", "Frost", "Floral", "Firefly", "Fascinate", "Fable", "Feather", "Flicker"};
    public static String[] gWords = {"Gazebo", "Glimmer", "Grace", "Gentle", "Galaxy", "Glisten", "Garnet", "Gentleman", "Giggly", "Glitter"};
    public static String[] hWords = {"Harmony", "Heavenly", "Honey", "Harbor", "Hope", "Heartfelt", "Halcyon", "Haven", "Halo", "Hyacinth"};
    public static String[] iWords = {"Imagine", "Infinite", "Inspire", "Ivory", "Island", "Illuminate", "Impulse", "Incandescent", "Ingenious", "Ineffable"};
    public static String[] jWords = {"Jubilant", "Jade", "Journey", "Joyful", "Jazz", "Jasmine", "Jovial", "Jigsaw", "Jubilee", "Jocular"};
    public static String[] kWords = {"Kaleidoscope", "Kindle", "Kinetic", "Keen", "Kismet", "Kale", "Kudos", "Kiss", "Kittens", "Knight"};
    public static String[] lWords = {"Lagoon", "Luminous", "Lullaby", "Lavender", "Lively", "Lunar", "Luscious", "Lyric", "Labyrinth", "Lilac"};
    public static String[] mWords = {"Majestic", "Mystic", "Moonlight", "Melody", "Mirth", "Magenta", "Mosaic", "Mellow", "Miracle", "Majesty"};
    public static String[] nWords = {"Nebula", "Nectar", "Nirvana", "Noble", "Nurturing", "Nautical", "Novel", "Nuance", "Nebulous", "Nestle"};
    public static String[] oWords = {"Orchid", "Opulent", "Oasis", "Oceanic", "Optimistic", "Ornate", "Outstanding", "Overcome", "Overjoyed", "Onyx"};
    public static String[] pWords = {"Peach", "Pristine", "Petal", "Panorama", "Pleasure", "Ponder", "Panache", "Peaceful", "Perfume", "Pinnacle"};
    public static String[] qWords = {"Quasar", "Quaint", "Quell", "Quest", "Quiver", "Quintessence", "Quirky", "Quiet", "Quintessential", "Quench"};
    public static String[] rWords = {"Radiant", "Reverie", "Ripple", "Rustic", "Rendezvous", "Rhapsody", "Resplendent", "Rejoice", "Rose", "Rapture"};
    public static String[] sWords = {"Serene", "Sapphire", "Serenade", "Symphony", "Sparkle", "Stellar", "Sublime", "Savor", "Sculpt", "Sylvan"};
    public static String[] tWords = {"Tranquil", "Twilight", "Tender", "Tropical", "Talisman", "Tidal", "Traverse", "Timeless", "Tintinnabulation", "Treasure"};
    public static String[] uWords = {"Umbra", "Utopia", "Unwind", "Uplift", "Utter", "Umbrella", "Unique", "Upbeat", "Universe", "Unity"};
    public static String[] vWords = {"Velvet", "Vivid", "Vibrant", "Vanilla", "Valiant", "Vortex", "Verdant", "Verve", "Voyage", "Virtue"};
    public static String[] wWords = {"Whisper", "Wander", "Wisp", "Willow", "Wavelength", "Wondrous", "Wishful", "Waltz", "Wonder", "Wildflower"};
    public static String[] xWords = {"Xanadu", "Xylophone", "Xenon", "Xeric", "X-factor", "Xenial", "Xenophobe", "Xanthein", "Xenagogue", "Xerox"};
    public static String[] yWords = {"Yearning", "Yonder", "Yoga", "Yummy", "Yield", "Yarn", "Yonder", "Yaffle", "Yoga", "Yonder"};
    public static String[] zWords = {"Zephyr", "Zenith", "Zeal", "Zest", "Zing", "Zircon", "Zestful", "Zen", "Zeppelin", "Zany"};


    public static String[] alphabetArrayNames = {"aWords", "bWords", "cWords", "dWords", "eWords", "fWords", "gWords", "hWords", "iWords", "jWords",
            "kWords", "lWords", "mWords", "nWords", "oWords", "pWords", "qWords", "rWords", "sWords", "tWords",
            "uWords", "vWords", "wWords", "xWords", "yWords", "zWords"};

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {


        String[] alphabetArray = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};


        Map<String, String[]> dictionary = new HashMap<>();


//       // this approach reads eacharray as a string not array name
//        for ( String eachArray : alphabetArrayNames ){
//            String arrayValue[] = eachArray
//
//        }
//




//        for (int i = 0; i < alphabetArrayNames.length; i++) {
//            String key = alphabetArray[i];
//            String[] value;
//
//            // Assign the predefined array to value based on array name
//            switch (alphabetArrayNames[i]) {
//                case "aWords":
//                    value = aWords;
//                    break;
//                case "bWords":
//                    value = bWords;
//                    break;



        // iterate using for Each and dynamically assign the value of the arrays (aWords ...) to the variable arrayValue
        for (String letter : alphabetArray) {
            String arrayName = letter + "Words";
            Field field;
            field = Alphabet.class.getDeclaredField(arrayName);
            String[] arrayValue = (String[]) field.get(null);
            dictionary.put(letter, arrayValue);
        }




        // Print the contents of the dictionary
        for ( Map.Entry<String, String[]> entry : dictionary.entrySet()) {
            String letter = entry.getKey();
            String[] words = entry.getValue();
            Arrays.sort(words);
            System.out.println("Letter: " + letter + ", Words: " + Arrays.toString(words));
        }

        // print by letter
        printByLetter("f", dictionary);


    } // end main


    public static boolean insert (String newWord , Map<String, String[]> dictionary ){
        newWord = newWord.toLowerCase();
        char first = newWord.charAt(0);
        if ( dictionary.containsKey(first) ){
            String localKey = String.valueOf(first);
            String[] oldArray = dictionary.get(localKey);
            String[] newArray = Arrays.copyOf(oldArray,oldArray.length+1);
            newArray[newArray.length-1] = newWord;
            dictionary.put(localKey,newArray);
            boolean response = true;
        }else {
            System.out.println("Key not found");
        }


        return response ;
    }




    public static void printByLetter(String key, Map<String, String[]> dictionary) {
        if (dictionary.containsKey(key)) {
            String[] wordsForCharacter = dictionary.get(key);
            System.out.println("Words available for " + key + ":" + Arrays.toString(wordsForCharacter));
        }
        else {
            System.out.println("No available Words for this key");
        }
    } // end printByLetter




} // end Alphabet Class
class NonRepeatedCharacter {
    public static void main(String[] args) {
        String str = "Nishant";

        str = str.toLowerCase();
        int[] freq = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
            }
        }

        boolean found = false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z' && freq[ch - 'a'] == 1) {
                System.out.println("First non-repeated character is: " + ch);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No non-repeated character found.");
        }
    }
}

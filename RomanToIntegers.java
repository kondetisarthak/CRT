public class RomanToInteger {
    public static int romanToInt(String s) {
        int total = 0;
        int prevValue = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int value = romanCharToInt(s.charAt(i));
            if (value >= prevValue) {
                total += value;
            } else {
                total -= value;
            }
            prevValue = value;
        }
        return total;
    }
    private static int romanCharToInt(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: throw new IllegalArgumentException("Invalid Roman numeral: " + c);
        }
    }
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV")); // 1994
        System.out.println(romanToInt("XLII"));    // 42
    }
}

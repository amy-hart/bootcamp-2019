public class CodingChallenge2 {

    // A = 4
    // B = 8
    // G = 9
    // I = 1
    // S = 5

    private static String registrationGenerator(String input)
    {
        System.out.println("Input: " + input);

        String [] inputAsArray = input.split("");

        StringBuilder output = new StringBuilder();

        String arrayElement = inputAsArray[0];

        switch(arrayElement) {
            case "A":
                output.append(4);
                break;
            case "B":
                output.append(8);
                break;
            case "G":
                output.append(9);
                break;
            case "I":
                output.append(1);
                break;
            case "S":
                output.append(5);
                break;
            default:
                output.append(arrayElement);
        }


        // Check array element 1



        // Check array element 2

        // Check array element 3

        // Check array element 4

        // Check array element 5

        // Check array element 6

        // Check array element 7
        return output.toString();
    }

    public static void main(String[] args) {
        registrationGenerator("SAIBG89");
    }
}

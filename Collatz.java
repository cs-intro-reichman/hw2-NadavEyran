public class Collatz {
    public static void main(String args[]) {
        int maxSeed = Integer.parseInt(args[0]);
        String mode = args[1];

        switch (mode) {
            case "v":
                for (int seed = 1; seed <= maxSeed; seed++) {
                    int current = seed;
                    int steps = 0;
                    System.out.print(seed + " ");
                    	while (current != 1) {
                        if (current % 2 == 0) {
                            current = current / 2;
                        } else {
                            current = current * 3 + 1;
                        }
                        System.out.print(current + " ");
                        steps++;
                    }
                    System.out.println("(" + steps + ")");
                }
                System.out.println("Every one of the first " + maxSeed + " hailstone sequences reached 1.");
                break;

            case "c":
                for (int seed = 1; seed <= maxSeed; seed++) {
                    int current = seed;
                    	while (current != 1) {
                        if (current % 2 == 0) {
                            current = current / 2;
                        } else {
                            current = current * 3 + 1;
                        }
                    }
                }
                System.out.println("Every one of the first " + maxSeed + " hailstone sequences reached 1.");
                break;

            default:
            System.out.println("Error");
        }
    }
}
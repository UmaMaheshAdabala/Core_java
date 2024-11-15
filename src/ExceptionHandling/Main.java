package ExceptionHandling;

class Main {
    public static void main(String[] args) throws CustomException {
        int a = 5;
        int b = 0;
        System.out.println(result(a, b));
    }

    private static int result(int a, int b) {
        int res = 0;
        try {
            if (b == 0)
                throw new CustomException("Cannot Divide by Zero");
            res = a / b;
            return res;

        } catch (CustomException e) {
            System.out.println(e.getMessage);
        }
        return res;
    }
}
public class Exceptions {
    public static class MyArraySizeException extends Exception {
    }
    public static class MyArrayDataException extends Exception {
    }
    public static int arrSum(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4 || arr[0].length != 4) {
            throw new MyArraySizeException();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[0].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e){
                    throw new MyArrayDataException();
                }
            }
        return sum;
    }
    public static void main(String[] args) {
        String[][] arr = {{"4", "4", "4", "4"}, {"4", "4", "4", "4"},{"4", "4", "4", "4"},{"4", "4", "4", "4"}};
        String[][] arr1 = {{"4", "4", "4", "4"}, {"4", "4", "4", "4"},{"4", "4", "4", "4"}};
        String[][] arr2 = {{"4", "4", "4", "4"}, {"4", "4", "4", "4"},{"4", "String", "4", "4"},{"4", "4", "4", "4"}};
        try {
            System.out.println(arrSum(arr));
        } catch (MyArraySizeException e) {
            System.out.println("Введен массив неправильного размера");
        } catch (MyArrayDataException e1) {
            System.out.println("Элемент массива не удаётся преобразовать в int ");
        }
        try {
            System.out.println(arrSum(arr1));
        } catch (MyArraySizeException e) {
            System.out.println("Введен массив неправильного размера");
        } catch (MyArrayDataException e1) {
            System.out.println("Элемент массива не удаётся преобразовать в int ");
        }
        try {
            System.out.println(arrSum(arr2));
        } catch (MyArraySizeException e) {
            System.out.println("Введен массив неправильного размера");
        } catch (MyArrayDataException e1) {
            System.out.println("Элемент массива не удаётся преобразовать в int ");
        }
    }
}

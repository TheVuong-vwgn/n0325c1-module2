package ss6.MyArrayList;

public class Main {
    public static void main(String[] args) {
        // Tạo một đối tượng Myarrlist
        MyArrayList myArrayList = new MyArrayList();

        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);
        myArrayList.add(40);
        myArrayList.add(50);
        myArrayList.add(30);
        myArrayList.add(30);

        System.out.println("Danh sách ban đầu: " + myArrayList.toString());

        myArrayList.add(2, 25);
        System.out.println("Danh sách sau khi thêm 25 vào vị trí 2: " + myArrayList.toString());

        myArrayList.set(3, 35);
        System.out.println("Danh sách sau khi thay thế ở vị trí 3 bằng 35: " + myArrayList.toString());

        int elementAtIndex = myArrayList.get(4);
        System.out.println("Phần tử tại vị trí 4 là: " + elementAtIndex);

        int elementToFind = 30;
        int indexOfElement = myArrayList.indexOf(elementToFind);
        if (indexOfElement != -1) {
            System.out.println("Vị trí index của phần tử " + elementToFind + "là: " + indexOfElement);
        } else {
            System.out.println("Không tìm thấy phần tử " + elementToFind + "trong danh sách");
        }

        int lastIndexOfElement = myArrayList.lastIndexOf(elementToFind);
        if (indexOfElement != -1) {
            System.out.println("Vị trí index cuối cùng của phần tử " + elementToFind + "là: " + lastIndexOfElement);
        } else {
            System.out.println("Không tìm thấy phần tử " + elementToFind + "trong danh sách");
        }

        myArrayList.remove(1);
        System.out.println("Danh sách sau khi xóa phần tử tại vị trí 1: " + myArrayList.toString());

        myArrayList.removeElement(30);
        System.out.println("Danh sách sau khi xóa phần tử có giá trị 30: " + myArrayList.toString());
    }
}

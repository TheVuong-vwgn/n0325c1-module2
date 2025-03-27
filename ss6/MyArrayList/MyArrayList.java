package ss6.MyArrayList;

import java.util.Arrays;

public class MyArrayList {
    private int capacity;

    private int[] arr;

    private int size;

    private int[] emptyAray = {};

    public int size() {
        return size;
    }

    public MyArrayList() {
        arr = emptyAray;
    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        this.arr = new int[this.capacity];
    }

    // a. add (int element): Thêm phần tử element vào cuối.
    public void add(int element) {
        if (arr == emptyAray) {
            this.capacity = 10;
            this.arr = new int[this.capacity];
        }

        if (size == capacity) {
            this.capacity *= 1.5; // 1
            if (size == capacity) { // Tránh trường hợp capacity = 0 hoặc 1
                capacity++;
            }

            // Tạo 1 mảng mới có kích thước là capacity
            int[] brr = new int[this.capacity];

            // Copy phần tử
            for (int i = 0; i < size; i++) {
                brr[i] = arr[i];
            }

            // cho a tham chiếu đến cùng nhớ mới
            arr = brr;
        }

        arr[size] = element;
        size++;
    }

    //b. toSting (): Trả về thông tin đối tượng
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < size; i++) {
            stringBuilder.append(arr[i]).append("\t");
        }
        return stringBuilder.toString();
    }

    //c. add(int index, int element)
    public void add(int index, int element) {
        // Kiểm tra index có hợp lệ
        if (index < 0 || index > size) {
            System.out.println("Index ngoài phạm vi!");
            return;
        }

        if (size == capacity) {
            this.capacity *= 1.5;
            if (size == capacity) {
                capacity++;
            }

            int[] brr = new int[this.capacity];

            // sao chép phần tử của mảng arr sang brr cho đến index
            for (int i = 0; i < index; i++) {
                brr[i] = arr[i];
            }

            brr[index] = element;

            // sao chép phần tử của mảng arr sang brr
            for (int i = 0; i < index; i++) {
                brr[i + 1] = arr[i];
            }

            arr = brr;
        } else {
            // Dịch chuyển phần tử từ index trở về sau sang phải để tạo chổ cho element mới
            for (int i = 0; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = element;
        }

        size++;
    }

    // d. set (int index, element): Thây thế phần tử tại vị trí index
    public void set(int index, int element) {
        // Kiểm tra index có hợp lệ
        if (index < 0 || index > size) {
            System.out.println("Index ngoài phạm vi!");
            return;
        }

        // gán giá trị mới vào index cụ thể
        arr[index] = element;
    }

    //e. get(int index): trả về phần tử tại index
    public Integer get(int index) {
        // Kiểm tra index có hợp lệ
        if (index < 0 || index > size) {
            System.out.println("Index ngoài phạm vi!");
            return null;
        }

        //Trả về phần tử tại index
        return arr[index];
    }

    //f. indexOf (int element): Lấy vị trí index phần tử đầu tiên tìm thấy
    public int indexOf(int element) {
        // Tìm vị trí index của phần tử đầu tiên tìm thấy
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        //Nếu không tìm thấy return -1
        return -1;
    }

    //g. lastIndexOf (int element): Lấy vị trí index phần tử cuối cùng tìm thấy
    public int lastIndexOf(int element) {
        // Tìm vị trí index của phần tử cuối cùng tìm thấy
        for (int i = size - 1; i >= 0; i--) {
            if (arr[i] == element) {
                return i;
            }
        }
        //Nếu không tìm thấy return -1
        return -1;
    }

    //h. remove (int index): xóa phần tử tại vị trí index
    public void remove(int index) {
        // Kiểm tra index có hợp lệ
        if (index < 0 || index > size) {
            System.out.println("Index ngoài phạm vi!");
            return;
        }

        // Dịch chuyển phần tử từ index trở về sau sang trái để xóa phần tử hiện tại index
        for (int i = 0; i < size; i++) {
            arr[i] = arr[i + 1];
        }

        size--;
    }

    //i. removeElement (int element): xóa phần tử từ element
    public void removeElement(int element) {
        int newIndex = 0;

        //Sao chép các phần tử khác với element vào mảng mới
        for (int i = 0; i < size; i++) {
            if (arr[i] != element) {
                arr[newIndex] = arr[i];
                newIndex++;
            }
        }

        // cập nhật size
        size = newIndex;
    }
}

package ss3_static.Exercise2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static ArrayList<Phone> phones = new ArrayList<>();

    static {
        phones.add(new OldPhone("DTC001", "Iphone 11", 15000000,
                6, "Apple", 96, "Đã qua sử dụng, tình trạng tốt"));
        phones.add(new OldPhone("DTC002", "Iphone 12", 16900000,
                6, "Apple", 96, "Đã qua sử dụng, tình trạng tốt"));

        phones.add(new NewPhone("DTM001", "Samsung Galaxy S25", 15000000,
                12, "Samsung", 15));
        phones.add(new NewPhone("DTM002", "Samsung Galaxy S23 Ultra", 25000000,
                12, "Samsung", 10));
    }

    public static void main(String[] args) {
        int choose;

        while (true) {
            do {
                System.out.println("- CHƯƠNG TRÌNH QUẢN LÝ ĐIỆN THOẠI");
                System.out.println("1. Xem danh sách điện thoại");
                System.out.println("2. Thêm mới");
                System.out.println("3. Cập nhật");
                System.out.println("4. Xóa");
                System.out.println("5. Sắp xếp theo giá");
                System.out.println("6. Tìm kiếm");
                System.out.println("7. Tính tổng tiền");
                System.out.println("8. Giảm giá cho điện thoại cũ");
                System.out.println("9. Thoát");
                System.out.print("Nhập chức năng: ");
                choose = scanner.nextInt();
                switch (choose) {
                    case 1:
                        menuShowList();
                        break;
                    case 2:
                        menuAddNew();
                        break;
                    case 3:
                        update();
                        break;
                    case 4:
                        delete();
                        break;
                    case 5:
                        menuSort();
                        break;
                    case 6:
                        menuSearch();
                        break;
                    case 7:
                    case 8:
                    case 9:
                        return;
                    default:
                        System.out.println("Nhập không đúng 1 -> 9, vui lòng nhập lại!!");
                }
            }while (choose < 0 || choose > 10);
        }
    }

    private static void menuShowList() {
        int choose;

        while (true) {
            do {
                System.out.println("- XEM DANH SÁCH ĐIỆN THOẠI -");
                System.out.println("1. Xem tất cả điện thoại");
                System.out.println("2. Xem điện thoại cũ");
                System.out.println("3. Xem điện thoại mới");
                System.out.println("4. Trở về menu chính");
                choose = scanner.nextInt();
                switch (choose) {
                    case 1:
                        System.out.println("- Danh sách tất cả điện thoại -");
                        for (int i = 0; i < phones.size(); i++) {
                            System.out.println("Thông tin điện thoại thứ " + (i + 1));
                            phones.get(i).output();
                        }
                        break;
                    case 2:
                        System.out.println("- Danh sách tất cả điện thoại cũ -");
                        int count = 1;
                        for (Phone phone : phones) {
                            if (phone instanceof OldPhone) {
                                System.out.println("Thông tin điện thoại thứ " + count++);
                                phone.output();
                            }
                        }
                        break;
                    case 3:
                        System.out.println("- Danh sách tất cả điện thoại mới -");
                        count = 1;
                        for (Phone phone : phones) {
                            if (phone instanceof NewPhone) {
                                System.out.println("Thông tin điện thoại thứ " + count++);
                                phone.output();
                            }
                        }
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Nhập không đúng 1 -> 4, vui lòng nhập lại!!");
                }
            }while (choose < 0 || choose > 4);
        }
    }

    private static void menuAddNew() {
        int choose;

        while (true) {
            do {
                System.out.println("- Thêm điện thoại -");
                System.out.println("1. Thêm điện thoại cũ");
                System.out.println("2. Thêm điện thoại mới");
                System.out.println("3. Trở về menu chính");
                choose = scanner.nextInt();
                switch (choose) {
                    case 1:
                        OldPhone oldPhone = new OldPhone();
                        oldPhone.input();
                        oldPhone.setId(oldPhone.getId());
                        phones.add(oldPhone);
                        System.out.println("Thêm mới thành công");
                    case 2:
                        NewPhone newPhone = new NewPhone();
                        newPhone.input();
                        newPhone.setId(newPhone.getId());
                        phones.add(newPhone);
                        System.out.println("Thêm mới thành công");
                    case 3:
                        return;
                    default:
                        System.out.println("Nhập không đúng 1 -> 3, vui lòng nhập lại!!");
                }
            }while (choose < 0 || choose > 3);
        }
    }

    private static String getIdOldPhone() {
        ArrayList<OldPhone> oldPhones = getOldPhone();

        if (oldPhones.size() == 0) {
            return "DTC001";
        }

        int max = Integer.parseInt(oldPhones.get(9).getId().substring(3));

        for (int i = 1; i < oldPhones.size(); i++) {
            int id = Integer.parseInt(oldPhones.get(i).getId().substring(3));
            if (max < id) {
                max = id;
            }
        }

        return String.format("DTC%3d", max + 1).replace(" ", "0");
    }

    private static ArrayList<OldPhone> getOldPhone() {
        ArrayList<OldPhone> oldPhones = new ArrayList<>();
        for (Phone phone : phones) {
            if (phone instanceof OldPhone){
                oldPhones.add((OldPhone) phone);
            }
        }
        return oldPhones;
    }

    private static String getIdNewPhone() {
        ArrayList<NewPhone> newPhones = getNewPhone();

        if (newPhones.size() == 0) {
            return "DTM001";
        }

        int max = Integer.parseInt(newPhones.get(9).getId().substring(3));

        for (int i = 1; i < newPhones.size(); i++) {
            int id = Integer.parseInt(newPhones.get(i).getId().substring(3));
            if (max < id) {
                max = id;
            }
        }

        return String.format("DTM%3d", max + 1).replace(" ", "0");
    }

    public static ArrayList<NewPhone> getNewPhone() {
        ArrayList<NewPhone> newPhones = new ArrayList<>();
        for (Phone phone : phones) {
            if (phone instanceof NewPhone){
                newPhones.add((NewPhone) phone);
            }
        }
        return newPhones;
    }

    public static void update() {
        System.out.print("Nhập vào id muốn cập nhật: ");
        String id = scanner.nextLine();

        if (id.startsWith("DTC") || id.startsWith("DTM")) {
            boolean isExistPhone = false;
            for (Phone phone : phones) {
                if (phone.getId().equals(id)) {
                    isExistPhone = true;
                    phone.input();
                    System.out.println("Cập nhật thành công!");
                    break;
                }
            }

            if (!isExistPhone) {
                System.out.println("Không tìm thấy id muốn cập nhật!");
            } else {
                System.out.println("Mã không hơp lệ");
            }
        }
    }

    public static void delete() {
        System.out.print("Nhập vào id muốn xóa: ");
        String id = scanner.nextLine();

        if (id.startsWith("DTC") || id.startsWith("DTM")) {
            boolean isExistPhone = false;
            for (Phone phone : phones) {
                if (phone.getId().equals(id)) {
                    isExistPhone = true;
                    System.out.printf("Bạn muốn xóa điện thoại có id %s không?\n", id);
                    System.out.println("Chọn Yes để xóa, No để hủy");
                    if("yes".equalsIgnoreCase(scanner.nextLine())) {
                        phones.remove(phone);
                        System.out.println("Xóa thành công!");
                    } else {
                        System.out.println("Đã hủy xóa");
                    }
                    break;
                }
            }

            if (!isExistPhone) {
                System.out.println("Không tìm thấy id muốn xóa!");
            } else {
                System.out.println("Mã không hơp lệ");
            }
        }
    }

    public static void menuSort() {
        int choose;

        while (true) {
            do {
                System.out.println("- Sắp xếp điện thoại theo giá -");
                System.out.println("1. Tăng dần");
                System.out.println("2. Giảm dần");
                System.out.println("3. Trở về menu chính");

                System.out.print("Mời bạn lựa chọn");
                choose = Integer.parseInt(scanner.nextLine());

                switch (choose) {
                    case 1:
                        for (int i = 0; i < phones.size() - 1; i++) {
                            for (int j = i + 1; j < phones.size(); j++) {
                                if (phones.get(i).getPrice() > phones.get(j).getPrice()) {
                                    Phone temp = phones.get(i);
                                    phones.set(i, phones.get(j));
                                    phones.set(j, temp);
                                }
                            }
                        }
                        break;
                    case 2:
                        for (int i = 0; i < phones.size() - 1; i++) {
                            for (int j = i + 1; j < phones.size(); j++) {
                                if (phones.get(i).getPrice() < phones.get(j).getPrice()) {
                                    Phone temp = phones.get(i);
                                    phones.set(i, phones.get(j));
                                    phones.set(j, temp);
                                }
                            }
                        }
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ, xin chọn lại!");
                }
            } while(choose < 0 || choose > 3);
        }
    }

    public static void menuSearch() {
        int choose;

        while (true) {
            do {
                System.out.println("- TÌM KIẾM ĐIỆN THOẠI -");
                System.out.println("1. Tìm kiếm tất cả điện thoại");
                System.out.println("2. Tìm kiếm điện thoại cũ");
                System.out.println("3. Tìm kiếm điện thoại mới");
                System.out.println("4. Trở về menu chính");

                System.out.print("Mời bạn lựa chọn");
                choose = Integer.parseInt(scanner.nextLine());

                switch (choose) {
                    case 1:
                        menuSearchAllPhone();
                        break;
                    case 2:
                        menuSearchOldPhone();
                        break;
                    case 3:
                        menuSearchNewPhone();
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ, xin chọn lại!");
                }
            } while(choose < 0 || choose > 3);
        }
    }

    public static void menuSearchAllPhone() {
        int choose;

        while (true) {
            do {
                System.out.println("- TÌM KIẾM TẤT CẢ ĐIỆN THOẠI -");
                System.out.println("1. Tìm kiếm theo giá");
                System.out.println("2. Tìm kiếm theo tên");
                System.out.println("3. Tìm kiếm theo hãng");
                System.out.println("4. Trở về menu tìm kiếm");

                System.out.print("Mời bạn lựa chọn");
                choose = Integer.parseInt(scanner.nextLine());

                switch (choose) {
                    case 1:
                        System.out.println("Nhập vào khoảng giá muốn tìm");
                        System.out.print("Nhập vào giá từ: ");
                        int priceFrom = Integer.parseInt(scanner.nextLine());

                        System.out.print("Nhập vào giá đến: ");
                        int priceTo = Integer.parseInt(scanner.nextLine());

                        int count = 1;
                        for (Phone phone : phones) {
                            if (phone.getPrice() >= priceFrom && phone.getPrice() <= priceTo) {
                                System.out.println("Thông tin điện thoại thứ " + count++);
                                phone.output();
                            }
                        }
                        break;
                    case 2:
                        System.out.print("Nhập vào tên cần tìm: ");
                        String name = scanner.nextLine();

                        count = 1;
                        for (Phone phone : phones) {
                            if (phone.getName().contains(name)) {
                                System.out.println("Thông tin điện thoại thứ " + count++);
                                phone.output();
                            }
                        }
                        break;
                    case 3:
                        System.out.print("Nhập vào hãng cần tìm: ");
                        String manufacture = scanner.nextLine();

                        count = 1;
                        for (Phone phone : phones) {
                            if (phone.getManufacturer().contains(manufacture)) {
                                System.out.println("Thông tin điện thoại thứ " + count++);
                                phone.output();
                            }
                        }
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ, xin chọn lại!");
                }
            } while(choose < 0 || choose > 4);
        }
    }

    public static void menuSearchOldPhone() {
        int choose;

        while (true) {
            do {
                System.out.println("- TÌM KIẾM ĐIỆN THOẠI CŨ -");
                System.out.println("1. Tìm kiếm theo giá");
                System.out.println("2. Tìm kiếm theo tên");
                System.out.println("3. Tìm kiếm theo hãng");
                System.out.println("4. Trở về menu tìm kiếm");

                System.out.print("Mời bạn lựa chọn");
                choose = Integer.parseInt(scanner.nextLine());

                ArrayList<OldPhone> oldPhones = getOldPhone();
                switch (choose) {
                    case 1:
                        System.out.println("Nhập vào khoảng giá muốn tìm");
                        System.out.print("Nhập vào giá từ: ");
                        int priceFrom = Integer.parseInt(scanner.nextLine());

                        System.out.print("Nhập vào giá đến: ");
                        int priceTo = Integer.parseInt(scanner.nextLine());

                        int count = 1;
                        for (Phone phone : oldPhones) {
                            if (phone.getPrice() >= priceFrom && phone.getPrice() <= priceTo) {
                                System.out.println("Thông tin điện thoại thứ " + count++);
                                phone.output();
                            }
                        }
                        break;
                    case 2:
                        System.out.print("Nhập vào tên cần tìm: ");
                        String name = scanner.nextLine();

                        count = 1;
                        for (Phone phone : oldPhones) {
                            if (phone.getName().contains(name)) {
                                System.out.println("Thông tin điện thoại thứ " + count++);
                                phone.output();
                            }
                        }
                        break;
                    case 3:
                        System.out.print("Nhập vào hãng cần tìm: ");
                        String manufacture = scanner.nextLine();

                        count = 1;
                        for (Phone phone : oldPhones) {
                            if (phone.getManufacturer().contains(manufacture)) {
                                System.out.println("Thông tin điện thoại thứ " + count++);
                                phone.output();
                            }
                        }
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ, xin chọn lại!");
                }
            } while(choose < 0 || choose > 4);
        }
    }

    public static void menuSearchNewPhone() {
        int choose;

        while (true) {
            do {
                System.out.println("- TÌM KIẾM ĐIỆN THOẠI MỚI -");
                System.out.println("1. Tìm kiếm theo giá");
                System.out.println("2. Tìm kiếm theo tên");
                System.out.println("3. Tìm kiếm theo hãng");
                System.out.println("4. Trở về menu tìm kiếm");

                System.out.print("Mời bạn lựa chọn");
                choose = Integer.parseInt(scanner.nextLine());

                ArrayList<NewPhone> newPhones = getNewPhone();
                switch (choose) {
                    case 1:
                        System.out.println("Nhập vào khoảng giá muốn tìm");
                        System.out.print("Nhập vào giá từ: ");
                        int priceFrom = Integer.parseInt(scanner.nextLine());

                        System.out.print("Nhập vào giá đến: ");
                        int priceTo = Integer.parseInt(scanner.nextLine());

                        int count = 1;
                        for (Phone phone : newPhones) {
                            if (phone.getPrice() >= priceFrom && phone.getPrice() <= priceTo) {
                                System.out.println("Thông tin điện thoại thứ " + count++);
                                phone.output();
                            }
                        }
                        break;
                    case 2:
                        System.out.print("Nhập vào tên cần tìm: ");
                        String name = scanner.nextLine();

                        count = 1;
                        for (Phone phone : newPhones) {
                            if (phone.getName().contains(name)) {
                                System.out.println("Thông tin điện thoại thứ " + count++);
                                phone.output();
                            }
                        }
                        break;
                    case 3:
                        System.out.print("Nhập vào hãng cần tìm: ");
                        String manufacture = scanner.nextLine();

                        count = 1;
                        for (Phone phone : newPhones) {
                            if (phone.getManufacturer().contains(manufacture)) {
                                System.out.println("Thông tin điện thoại thứ " + count++);
                                phone.output();
                            }
                        }
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ, xin chọn lại!");
                }
            } while(choose < 0 || choose > 4);
        }
    }


}

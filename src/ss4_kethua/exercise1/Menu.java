package ss4_kethua.exercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);
    static OldPhone oldP = new OldPhone();
    static NewPhone newP = new NewPhone();
    static ArrayList<Phone> phones = new ArrayList<>();
    static int choose;

    static {
        phones.add(new NewPhone("DTM001", "dien thoai 1", 1234, 4, "hãng 1", 6));
        phones.add(new NewPhone("TDM002", "dien thoai 2", 12344, 4, "hãng 2", 6));
        phones.add(new OldPhone("DTC001", "dien thoai 2", 12345, 4, "hãng 3", "tình trạng pin", "mô tả 1"));
    }

    public void listMenu() {
        while (true) {
            do {
                System.out.println("1. Xem danh sách điện thoại");
                System.out.println("2. Thêm mới");
                System.out.println("3. Cập nhật");
                System.out.println("4. Xóa");
                System.out.println("5. Xắp xếp theo giá");
                System.out.println("6. Tìm kiếm ");
                System.out.println("7. Tính tổng tiền ");
                System.out.println("8. Giảm giá cho điện thoại cũ ");
                System.out.println("9. Thoát chương trình  ");
                System.out.println("Mời bạn chọn: ");
                choose = scanner.nextInt();
                switch (choose) {
                    case 1:
                        list();
                        break;
                    case 2:
                        input();
                        break;
                    case 3:
                        update();
                        break;
                    case 4:
                        delete();
                        break;
                    case 5:
                        sapXep();
                        break;
                    case 6:
                        timKiem();
                        break;
                    case 7:
                        System.out.println("Tổng tiền: "+tongTien());
                        break;
                    case 8:
                        giamGia();
                        break;
                    case 9:
                        return;
                    default:
                        System.out.println("Vui long nhap lai");
                }
            } while (choose < 1 || choose > 8);
        }
    }

    public static void list() {
        while (true) {
            do {
                System.out.println("----danh sách điện thoại----");
                System.out.println("1. Xem tất cả");
                System.out.println("2. Xem điện thoại cũ");
                System.out.println("3. Xem điện thoại mới");
                System.out.println("4. Thoát");
                System.out.println("Mời bạn chọn");
                choose = scanner.nextInt();
                scanner.nextLine();
                switch (choose) {
                    case 1:
                        System.out.println("---danh sách tất cả điện thoại---");
                        for (int i = 0; i < phones.size(); i++) {
                            System.out.println("Thông tin điện thoại " + i);
                            phones.get(i).output();
                        }
                        for (int i = 0; i < phones.size(); i++) {
                            System.out.println("Thông tin điện thoại " + (i + 1 + phones.size()
                            ));
                            phones.get(i).output();
                        }
                        break;
                    case 2:
                        System.out.println("---Thông tin điện thoại cũ---");
                        for (int i = 0; i < phones.size(); i++) {
                            System.out.println("Thông tin điện thoại " + i);
                            phones.get(i).output();
                        }
                        break;
                    case 3:
                        System.out.println("---Thông tin điện thoại mới---");
                        for (int i = 0; i < phones.size(); i++) {
                            System.out.println("Thông tin điện thoại " + i);
                            phones.get(i).output();
                        }
                        break;
                    case 4:
                        return;
                }
            } while (choose < 1 || choose > 4);
        }
    }

    public static void input() {
        while (true) {
            do {
                System.out.println("---Thêm mới---");
                System.out.println("1. Thêm mới điện thoại cũ");
                System.out.println("2. Thêm mới điện thọai mới");
                System.out.println("3. Thoát");
                System.out.println("Mời bạn chọn");
                choose = scanner.nextInt();
                scanner.nextLine();
                switch (choose) {
                    case 1:
                        oldP.input();
                        phones.add(oldP);
                        break;
                    case 2:
                        newP.input();
                        phones.add(newP);
                        break;
                    case 3:
                        return;
                }
            } while (choose < 1 || choose > 3);
        }
    }

    public static void update() {
        System.out.print("Nhap ID can sua: ");
        String idUpdate = scanner.nextLine();

        if (idUpdate.startsWith("DTM")) {
            for (int i = 0; i < phones.size(); i++) {
                if (phones.get(i).getId().equalsIgnoreCase(idUpdate)) {
                    phones.get(i).input(idUpdate);//
                    break;
                } else {
                    System.out.println("ID khong hop le!");
                }
            }
        } else if (idUpdate.startsWith("DTC")) {
            for (int i = 0; i < phones.size(); i++) {
                if (phones.get(i).getId().equalsIgnoreCase(idUpdate)) {
                    phones.get(i).input(idUpdate);//
                    break;
                } else {
                    System.out.println("ID khong hop le!");
                }
            }
        } else {
            System.out.println("ID khong hop le!");
        }
    }

    public static void delete() {
        System.out.print("Nhap ID muon xoa: ");
        String idDelete = scanner.nextLine();

        if (idDelete.startsWith("DTM")) {
            for (int i = 0; i < phones.size(); i++) {
                if (phones.get(i).getId().equalsIgnoreCase(idDelete)) {
                    phones.remove(i);
                    System.out.println("đã xóa");
                    break;
                } else {
                    System.out.println("ID khong hop le!");
                }
            }
        } else if (idDelete.startsWith("DTC")) {
            for (int i = 0; i < phones.size(); i++) {
                if (phones.get(i).getId().equalsIgnoreCase(idDelete)) {
                    phones.remove(i);
                    System.out.println("Đã xóa");
                    break;
                } else {
                    System.out.println("ID khong hop le!");
                }
            }
        } else {
            System.out.println("ID khong hop le!");
        }
    }

    public static void sapXep() {
        while (true) {
            do {
                System.out.println("-- Sắp xếp theo giá --");
                System.out.println("1. Sắp xếp tăng dần.");
                System.out.println("2. Sắp xếp giảm dần.");
                System.out.println("3. Quay lại.");
                System.out.print("Chọn chức năng: ");
                choose = scanner.nextInt();
                scanner.nextLine();
                switch (choose) {
                    case 1:
                        for (int i = 0; i < phones.size() - 1; i++) {
                            for (int j = i + 1; j < phones.size(); j++) {
                                if (phones.get(i).getGia() > phones.get(j).getGia()) {
                                    Phone temp = phones.get(i);
                                    phones.set(i, phones.get(j));
                                    phones.set(j, temp);
                                }
                            }
                        }
                        break;
                    case 2:
                        //Sắp xếp giảm dần
                        for (int i = 0; i < phones.size() - 1; i++) {
                            for (int j = i + 1; j < phones.size(); j++) {
                                if (phones.get(i).getGia() < phones.get(j).getGia()) {
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
                        System.out.println("Chức năng không tồn tại.");
                }
            } while (choose < 1 || choose > 3);
        }
    }

    public void timKiem() {
        while (true) {
            do {
                System.out.println("---Tìm kiếm---");
                System.out.println("1. Tìm kiếm tất cả điện thoại");
                System.out.println("2. Tìm kiếm điện thoại cũ");
                System.out.println("3. Tìm kiếm điện thoại mới");
                System.out.println("4. Trở về menu chính");
                System.out.println("Mời bạn chọn: ");
                choose = scanner.nextInt();
                scanner.nextLine();
                switch (choose) {
                    case 1:
                        searchAllPhone();
                        break;
                    case 2:
                        searhOldPhone();
                        break;
                    case 3:
                        searhNewPhone();
                        break;
                    case 4:
                        return;
                }

            } while (choose < 1 || choose > 4);
        }
    }

    public static void searchAllPhone() {
        while (true) {
            do {
                System.out.println("1. Tìm kiếm theo giá");
                System.out.println("2. Tìm kiếm theo tên");
                System.out.println("3. Tìm kiếm theo hãng");
                System.out.println("4. Trở lại menu chính");
                System.out.println(" Mời bạn chọn");
                choose = scanner.nextInt();
                scanner.nextLine();
                switch (choose) {
                    case 1:
                        System.out.println("Nhập khoảng giá muốn tìm: ");
                        System.out.println("Giá từ: ");
                        int priceFrom = Integer.parseInt(scanner.nextLine());
                        System.out.println("Đến: ");
                        int priceTo = Integer.parseInt(scanner.nextLine());
                        int count = 1;
                        for (Phone phone : phones) {
                            if (phone.getGia() >= priceFrom && phone.getGia() <= priceTo) {
                                System.out.println("Thông tin điện thoại thứ :" + count++);
                                phone.output();
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Nhập tên cần tìm: ");
                        String nameSearch = scanner.nextLine();
                        count = 1;
                        for (Phone phone : phones) {
                            if (phone.getTen().contains(nameSearch)) {
                                System.out.println("Thông tin điện thoại thứ :" + count++);
                                phone.output();
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Nhập hãng điện thoại muốn tìm: ");
                        String hang = scanner.nextLine();
                        count = 1;
                        for (Phone phone : phones) {
                            if (phone.getHang().contains(hang)) {
                                System.out.println("Thông tin điện thoại thứ :" + count++);
                                phone.output();
                            }
                        }
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Vui lòng chọn lại");
                }
            } while (choose < 1 || choose > 4);
        }
    }

    public static ArrayList<OldPhone> getOldPhone() {
        ArrayList<OldPhone> oldPhones = new ArrayList<>();
        for (Phone phone : phones) {
            if (phone instanceof OldPhone) {
                oldPhones.add((OldPhone) phone);
            }
        }
        return oldPhones;
    }

    public static void searhOldPhone() {
        ArrayList<OldPhone> oldPhones = getOldPhone();
        while (true) {
            do {
                System.out.println("1. Tìm kiếm theo giá");
                System.out.println("2. Tìm kiếm theo tên");
                System.out.println("3. Tìm kiếm theo hãng");
                System.out.println("4. Trở lại menu chính");
                System.out.println(" Mời bạn chọn");
                choose = scanner.nextInt();
                scanner.nextLine();
                switch (choose) {
                    case 1:
                        System.out.println("Nhập khoảng giá muốn tìm: ");
                        System.out.println("Giá từ: ");
                        int priceFrom = Integer.parseInt(scanner.nextLine());
                        System.out.println("Đến: ");
                        int priceTo = Integer.parseInt(scanner.nextLine());
                        int count = 1;
                        for (Phone phone : oldPhones) {
                            if (phone.getGia() >= priceFrom && phone.getGia() <= priceTo) {
                                System.out.println("Thông tin điện thoại thứ :" + count++);
                                phone.output();
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Nhập tên cần tìm: ");
                        String nameSearch = scanner.nextLine();
                        count = 1;
                        for (Phone phone : oldPhones) {
                            if (phone.getTen().contains(nameSearch)) {
                                System.out.println("Thông tin điện thoại thứ :" + count++);
                                phone.output();
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Nhập hãng điện thoại muốn tìm: ");
                        String hang = scanner.nextLine();
                        count = 1;
                        for (Phone phone : oldPhones) {
                            if (phone.getHang().contains(hang)) {
                                System.out.println("Thông tin điện thoại thứ :" + count++);
                                phone.output();
                            }
                        }
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Vui lòng chọn lại");
                }
            } while (choose < 1 || choose > 4);
        }
    }
    public static ArrayList<NewPhone> getNewPhone() {
        ArrayList<NewPhone> newPhones = new ArrayList<>();
        for (Phone phone : phones) {
            if (phone instanceof NewPhone) {
                newPhones.add((NewPhone) phone);
            }
        }
        return newPhones;
    }

    public static void searhNewPhone() {
        ArrayList<NewPhone> newPhones = getNewPhone();
        while (true) {
            do {
                System.out.println("1. Tìm kiếm theo giá");
                System.out.println("2. Tìm kiếm theo tên");
                System.out.println("3. Tìm kiếm theo hãng");
                System.out.println("4. Trở lại menu chính");
                System.out.println(" Mời bạn chọn");
                choose = scanner.nextInt();
                scanner.nextLine();
                switch (choose) {
                    case 1:
                        System.out.println("Nhập khoảng giá muốn tìm: ");
                        System.out.println("Giá từ: ");
                        int priceFrom = Integer.parseInt(scanner.nextLine());
                        System.out.println("Đến: ");
                        int priceTo = Integer.parseInt(scanner.nextLine());
                        int count = 1;
                        for (Phone phone : newPhones) {
                            if (phone.getGia() >= priceFrom && phone.getGia() <= priceTo) {
                                System.out.println("Thông tin điện thoại thứ :" + count++);
                                phone.output();
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Nhập tên cần tìm: ");
                        String nameSearch = scanner.nextLine();
                        count = 1;
                        for (Phone phone : newPhones) {
                            if (phone.getTen().contains(nameSearch)) {
                                System.out.println("Thông tin điện thoại thứ :" + count++);
                                phone.output();
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Nhập hãng điện thoại muốn tìm: ");
                        String hang = scanner.nextLine();
                        count = 1;
                        for (Phone phone : newPhones) {
                            if (phone.getHang().contains(hang)) {
                                System.out.println("Thông tin điện thoại thứ :" + count++);
                                phone.output();
                            }
                        }
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Vui lòng chọn lại");
                }
            } while (choose < 1 || choose > 4);
        }
    }

    public static double tongTien() {
        int sum=0;
        for (Phone phone : phones) {
            sum+=phone.tinhTongTien();
        }
        return sum;
    }

    private void giamGia() {
    }

}




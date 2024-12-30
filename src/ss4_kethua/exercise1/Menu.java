package ss4_kethua.exercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<OldPhone> oldPhones = new ArrayList<>();
    static ArrayList<NewPhone> newPhones = new ArrayList<>();
    static OldPhone oldp = new OldPhone();
    static NewPhone newP = new NewPhone();
    static int choose;

    static {

        newPhones.add(new NewPhone("DTM001", "dien thoai 1", 1234, 4, "hãng 1", 6));
        newPhones.add(new NewPhone("TDM002", "dien thoai 1", 1234, 4, "hãng 1", 6));
        oldPhones.add(new OldPhone("DTC001", "dien thoai 1", 1234, 4, "hãng 1", "tình trạng pin", "mô tả 1"));
    }

    public void listMenu() {
        while (true) {
            System.out.println("1. Xem danh sách điện thoại");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Xắp xếp theo giá");
            System.out.println("6. Tìm kiếm ");
            System.out.println("7. Tính tổng tiền ");
            System.out.println("8. Thoát chương trình  ");
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
                    tinhTongTien();
                    break;
                case 8:
                    return;
                default:
                    System.out.println("Vui long nhap lai");
            }
        }
    }

    private void tinhTongTien() {
    }

    private void timKiem() {
    }

    private static void input() {
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
                        oldp.input();
                        oldPhones.add(oldp);
                        break;
                    case 2:
                        newP.input();
                        newPhones.add(newP);
                        break;
                    case 3:
                        return;
                }
            } while (choose == 3);
        }
    }

    public static void list() {
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
                    for (int i = 0; i < oldPhones.size(); i++) {
                        System.out.println("Thông tin điện thoại " + i);
                        oldPhones.get(i).output();
                    }
                    for (int i = 0; i < newPhones.size(); i++) {
                        System.out.println("Thông tin điện thoại " + (i + 1 + oldPhones.size()
                        ));
                        newPhones.get(i).output();
                    }
                    break;
                case 2:
                    System.out.println("---Thông tin điện thoại cũ---");
                    for (int i = 0; i < oldPhones.size(); i++) {
                        System.out.println("Thông tin điện thoại " + i);
                        oldPhones.get(i).output();
                    }
                    break;
                case 3:
                    System.out.println("---Thông tin điện thoại mới---");
                    for (int i = 0; i < newPhones.size(); i++) {
                        System.out.println("Thông tin điện thoại " + i);
                        newPhones.get(i).output();
                    }
                    break;
                case 4:
                    return;
            }
        } while (choose == 4);

    }

    public static void update() {
        System.out.print("Nhap ID can sua: ");
        String idUpdate = scanner.nextLine();

        if (idUpdate.startsWith("DTM")) {
            for (int i = 0; i < newPhones.size(); i++) {
                if (newPhones.get(i).getId().equalsIgnoreCase(idUpdate)) {
                    newPhones.get(i).input();
                    break;
                } else {
                    System.out.println("ID khong hop le!");
                }
            }
        } else if (idUpdate.startsWith("DTC")) {
            for (int i = 0; i < oldPhones.size(); i++) {
                if (oldPhones.get(i).getId().equalsIgnoreCase(idUpdate)) {
                    oldPhones.get(i).input();
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
            for (int i = 0; i < newPhones.size(); i++) {
                if (newPhones.get(i).getId().equalsIgnoreCase(idDelete)) {
                    newPhones.remove(i);
                    System.out.println("đã xóa");
                    break;
                } else {
                    System.out.println("ID khong hop le!");
                }
            }
        } else if (idDelete.startsWith("DTC")) {
            for (int i = 0; i < oldPhones.size(); i++) {
                if (oldPhones.get(i).getId().equalsIgnoreCase(idDelete)) {
                    oldPhones.remove(i);
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
        System.out.println("-- Sắp xếp theo giá --");
        System.out.println("1. Sắp xếp tăng dần.");
        System.out.println("2. Sắp xếp giảm dần.");
        System.out.println("3. Quay lại.");
        System.out.print("Chọn chức năng: ");
        choose = Integer.parseInt(scanner.next());
        switch (choose) {
            case 1:
                for (int i = 0; i < newPhones.size() - 1; i++) {
                    for (int j = 0; j < newPhones.size() - i - 1; j++) {
                        if (newPhones.get(i).getGia() < newPhones.get(j + 1).getGia()) {
                            newPhones.get(i).setGia(newPhones.get(j + 1).getGia());
                            newPhones.get(j + 1).setGia(newPhones.get(i).getGia());
                            newPhones.get(i).setGia(newPhones.get(j).getGia());
                            newP.output();
                        }
                    }
                }
                break;
            case 2:
                //Sắp xếp giảm dần
                break;
            case 3:
                return;
            default:
                System.out.println("Chức năng không tồn tại.");
        }
    }
}

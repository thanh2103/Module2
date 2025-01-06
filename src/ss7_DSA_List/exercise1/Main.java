package ss7_DSA_List.exercise1;

public class Main {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);
        myArrayList.add(4);
        myArrayList.add(3);


        System.out.println("Danh sách ban đầu: " + myArrayList.toString());

        myArrayList.set(2, 25);
        System.out.println("danh sách sau khi chèn 25 vào vị trí 2: " + myArrayList.toString());

        //thay thế phần tử tại vị trí index
        myArrayList.set(3, 35);
        System.out.println("Danh sách sau khi thay thế 35 tại vị trí 3:" + myArrayList.toString());

        //trar về phần tử tại vị trí index
        int elementAtIndex = myArrayList.get(1);
        System.out.println("Phần tử tại vị trí 4: " + elementAtIndex);

        //lấy vị trí index đầu tiên phânf tử tìm thấy

        int elementToFind = 4;
        int indexOfElement = myArrayList.indexOf(elementToFind);
        if (indexOfElement != -1) {
            System.out.println("Vi tri i cua phan tu " + elementToFind + " la: " + indexOfElement);
        } else {
            System.out.println("Khong ton tai  " + elementToFind + " trong list.");
        }

        int lastIndexOfElement = myArrayList.lastIndexOf(elementToFind);
        if (lastIndexOfElement != -1) {
            System.out.println("Vi tri index cuoi cung cua " + elementToFind + " la: " + lastIndexOfElement);
        } else {
            System.out.println("Khong ton tai  " + elementToFind + " trong list.");
        }

        myArrayList.remove(3);
        System.out.println("Danh sach sau khi xoa phan tu tai vi tri 3: " + myArrayList.toString());

        myArrayList.removeElement(100);
        System.out.println("Danh sach sau khi xoa phan tu 100: " + myArrayList.toString());
    }
}

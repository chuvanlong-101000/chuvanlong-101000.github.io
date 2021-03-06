public class App {
    public static void main(String[] args) {
        System.out.println("Chào các bạn lớp Java 4");
    Math math = new Math();
    //Math là tên của class. Tên của Class luôn bắt đầu bằng chữ Hoa
    //math là tên của object
    System.out.println(math.isOdd(4));

    float weight = 74f;
    float height = 1.76f;
    System.out.println("Chỉ số BMI của thầy Cường " + math.calculateBMI(height, weight));

    float diameter = 3.0f;
    System.out.println("Chu vi của hình tròn có đường kính " 
    + diameter + " = " 
    + math.circle_perimeter(diameter));

    float x = 5.0f;
    float y = 3.0f;
    float z = 2.0f;
    if (math.isTriangle(x, y, z)) {
      System.out.println("x : " + x + ", y : " + y + ", z : " + z + " tạo thành một tam giác");
    } else {
      System.out.println("x : " + x + ", y : " + y + ", z : " + z + " không tạo thành một tam giác");
    }

    System.out.println("Số nhỏ nhất trong x: " + x 
    + ", y: " + y 
    + ", z: " + z 
    + " là " + math.smallestIn3Numbers(x, y, z));

    int[] intArray = new int[]{1, 2, 3};
    System.out.println("Tổng của một mảng " + math.sum(intArray));

    
  }
}

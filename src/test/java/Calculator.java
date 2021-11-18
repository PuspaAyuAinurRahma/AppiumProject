import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Calculator extends BaseClass{
    @Test
    public static void plus() {
        Plus plus = new Plus();
        MobileElement Seven = (MobileElement) driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_b_a"));
        MobileElement Plus = (MobileElement) driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_d_d"));
        MobileElement Nine = (MobileElement) driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_b_c"));
        MobileElement Equals = (MobileElement) driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_e_d"));
        MobileElement Results = (MobileElement) driver.findElement(By.id("com.dencreak.dlcalculator:id/lay_normal_body_val"));

        String InputSatu = Seven.getText();
        String InputDua = Nine.getText();
        plus.Tambah(InputSatu, InputDua);
        int Hasil = plus.Tambah(InputSatu, InputDua);

        Seven.click();
        Plus.click();
        Nine.click();
        Equals.click();

        String res = Results.getText();
        if(Integer.parseInt(res) == Hasil){
            System.out.println("Completed Plus Test ....");
        }else {
            System.out.println("Failed");
        }

    }

    @Test
    public static void minus() {
        Minus minus = new Minus();
        MobileElement Seven = (MobileElement) driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_b_a"));
        MobileElement Minus = (MobileElement) driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_c_d"));
        MobileElement Four = (MobileElement) driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_c_a"));
        MobileElement Equals = (MobileElement) driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_e_d"));
        MobileElement Results = (MobileElement) driver.findElement(By.id("com.dencreak.dlcalculator:id/lay_normal_body_val"));

        String InputSatu = Seven.getText();
        String InputDua = Four.getText();
        minus.Kurang(InputSatu, InputDua);
        int Hasil = minus.Kurang(InputSatu, InputDua);

        Seven.click();
        Minus.click();
        Four.click();
        Equals.click();

        String res = Results.getText();
        if(Integer.parseInt(res) == Hasil){
            System.out.println("Completed Minus Test ....");
        }else {
            System.out.println("Failed");
        }

    }

    @Test
    public static void multiplication() {
        Multiplication multiplication = new Multiplication();
        MobileElement Seven = (MobileElement) driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_b_a"));
        MobileElement Multiplication = (MobileElement) driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_b_d"));
        MobileElement Nine = (MobileElement) driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_b_c"));
        MobileElement Equals = (MobileElement) driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_e_d"));
        MobileElement Results = (MobileElement) driver.findElement(By.id("com.dencreak.dlcalculator:id/lay_normal_body_val"));

        String InputSatu = Seven.getText();
        String InputDua = Nine.getText();
        multiplication.Kali(InputSatu, InputDua);
        int Hasil = multiplication.Kali(InputSatu, InputDua);

        Seven.click();
        Multiplication.click();
        Nine.click();
        Equals.click();

        String res = Results.getText();
        if(Integer.parseInt(res) == Hasil){
            System.out.println("Completed Multiplication Test ....");
        }else {
            System.out.println("Failed");
        }

    }

    @Test
    public static void distribution() {
        Distribution distribution = new Distribution();
        MobileElement Nine = (MobileElement) driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_b_c"));
        MobileElement Distribution = (MobileElement) driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_a_d"));
        MobileElement Three = (MobileElement) driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_d_c"));
        MobileElement Equals = (MobileElement) driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_e_d"));
        MobileElement Results = (MobileElement) driver.findElement(By.id("com.dencreak.dlcalculator:id/lay_normal_body_val"));

        String InputSatu = Nine.getText();
        String InputDua = Three.getText();
        distribution.Bagi(InputSatu, InputDua);
        int Hasil = distribution.Bagi(InputSatu, InputDua);

        Nine.click();
        Distribution.click();
        Three.click();
        Equals.click();

        String res = Results.getText();
        if(Integer.parseInt(res) == Hasil){
            System.out.println("Completed Distribution Test ....");
        }else {
            System.out.println("Failed");
        }

    }
}

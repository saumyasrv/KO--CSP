import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
   public static void main(String[] args) throws IOException {
        // 定义一个 BufferedReader 用于读取输入数据，使用匿名内部类的方式
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());// 需要输入数据的行数
        Info[] infos = new Info[n + 1];// infos数组用于存储考生信息
        // 处理输入数据
        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            Info info = new Info(Integer.parseInt(str[1]), str[0], Integer.parseInt(str[2]));
            infos[Integer.parseInt(str[1])] = info;
        }
        // 处理输出数据
        int m = Integer.parseInt(br.readLine());
        String[] s =  br.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            System.out.println(infos[Integer.parseInt(s[i])].toString());
        }

    }
}

// 定义一个类用于表示考生的信息
class Info{
    int index;
    String id;// 考生的准考证号
    int seatId;// 考试座位号码

    // 无参构造
    public Info() {
    }

    // 有参构造
    public Info(int index, String id, int seatId) {
        this.index = index;
        this.id = id;
        this.seatId = seatId;
    }

    // 使用get、set方法为属性赋值
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    // 利用toString方法打印输出
    @Override
    public String toString() {
        return id + " " + seatId;
    }
}

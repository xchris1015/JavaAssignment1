class FreshJuice{
    enum FreshJuiceSize{Small,Medium,Large}
    FreshJuiceSize size;
        }
public class FreshJuicTest {
    public static void main(String []args){
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.Large;
        System.out.println("Size:"+juice.size);
    }
}


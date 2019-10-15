public class StaticBlock {
    static {
        System.out.println("2");
    }
    {
        System.out.println("1");
    }

    public StaticBlock(){
        System.out.println("3");
    }
    {
        System.out.println("4");
    }
}

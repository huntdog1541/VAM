/**
 * Created by David on 4/2/2016.
 */
public class register {

    private byte[] reg;
    private int regSize;

    public register()
    {

    }

    public register(int size)
    {
        regSize = size;
        reg = new byte[size];
    }

    public register(int size, int number)
    {
        regSize = size;
        reg = convertToReg(number);
    }

    private byte[] convertToReg(int number)
    {
        if(number > (int)Math.round((Math.pow(regSize, 2))))
        {
            return null;
        }
        byte[] temp;
        String temp2 = Integer.toBinaryString(number);
        temp = temp2.getBytes();
        return temp;
    }

    public void printRegister()
    {
        String line = new String(reg);
        System.out.println("Reg: " + line);
    }

    public void printRegister(String regNum)
    {
        String line = new String(reg);
        System.out.println(regNum + ": " + line);
    }
}

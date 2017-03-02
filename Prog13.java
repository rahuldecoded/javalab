import javax.swing.JOptionPane;
class Prog13
{
	public static void main(String[] args)
	{
	String s;
	int i=1,a,sum=0;
	s=JOptionPane.showInputDialog("Enter your number");
	a=Integer.parseInt(s);
	while(i<=a)
		{
		sum=sum+i;
		i++;
		}
	JOptionPane.showMessageDialog(null,"Average of first "+a+" numbers is "+(sum/a),"Result",JOptionPane.PLAIN_MESSAGE);
	System.exit(0);
	}
}

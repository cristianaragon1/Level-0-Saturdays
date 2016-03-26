import java.io.IOException;

public class rocket {
	public static void main(String[] args) {
		for (int i = 10; i > -1; i--) {
			System.out.println(i);
			try {
				Runtime.getRuntime().exec("say " + i).waitFor();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (i == 0) {
				System.out.println("Blast off!");

			}
		}

	}
}

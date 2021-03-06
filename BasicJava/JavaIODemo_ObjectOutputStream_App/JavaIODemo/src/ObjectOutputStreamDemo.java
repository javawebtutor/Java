import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo
{

	public static void main(String[] args) throws FileNotFoundException,
			IOException, ClassNotFoundException
	{
		ObjectOutputStreamDemo objectOutputStreamDemo = new ObjectOutputStreamDemo();
		objectOutputStreamDemo.writeEmployeeObject();
	}

	private void writeEmployeeObject() throws FileNotFoundException,
			IOException
	{
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		try
		{
			fileOutputStream = new FileOutputStream("employee.txt");
			objectOutputStream = new ObjectOutputStream(fileOutputStream);

			Employee employee = new Employee("Peter",20);
			System.out.println(employee);

			/*
			 * Write the specified object to the
			 * ObjectOutputStream.
			 */
			objectOutputStream.writeObject(employee);
			System.out
					.println("Successfully written employee object to the file.\n");
		}
		finally
		{

			if (objectOutputStream != null)
			{
				/*
				 * Closing a ObjectOutputStream will also
				 * close the OutputStream instance to which
				 * the ObjectOutputStream is writing.
				 */
				objectOutputStream.close();
			}
		}

	}

}

class array_1
{
	public static void main(string...args){
		int arr[]=new int arr[5];
		arr[0] = 11;
		arr[1] = 69;
		arr[2] = 78;
		arr[3] = 50;
		arr[4] = 89;
		system.out.println("size of an array:" + arr.length);
		system.out.println("print array with to string:");
		system.out.println(Array.to string(arr));
		system.out.println("print using for loop");
		for(int i=0; i<arr.length;i++);
		{
			system.out.println(i);
		}
		system.out.println("reverse an array");
		for(int arr=arr.length;i>=0; i--)
		{
			system.out.println(arr[i]);
		}
		system.out.println("linear search");
		int target = 70;
		for(int i=0i<=arr.length; i++)
		{ 
			if (arr[i] == target)
			{
				system.out.println(i);
			}
		else
		{
			system.out.println("not found");
		}
		}
		int max = arr[0];
		for(int i = 0; i<arr.length; i++)
		{
			if (arr[i] > max)
			{
			  max = arr[i];
			}
		}
		system.out.println(max);
	}
}
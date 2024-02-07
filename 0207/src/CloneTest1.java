class Data implements Cloneable {
	String str;
	
	public Data(String str) {
		this.str = str;
	}
	
	@Override
	//implements Cloneable를 하면 예외 발생 X (clone이 Clonable의 자식인지 확인) 
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
		
		//이런 의미와 같은 거임
//		if(this instanceof Cloneable) {  //Cloneable의 자식이 아니면 예외 발생하도록
//			throw new CloneNotSupportedException();
//		}
	}
	
//	@Override
// 	public Object clone() {
//		return new String(str);
//	}
}

public class CloneTest1 {
	public static void main(String[] args) {
		Data data1 = new Data("Stiven");
		Data data2 = (Data)data1.clone();
		System.out.println(data1.str);
		System.out.println(data2.str);
		
		data1.str = "Micle";
		System.out.println(data1.str);
		System.out.println(data2.str);
	}
}

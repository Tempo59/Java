package day13homework;

public class ZooAnimalManageSystem {

	public void fun(Animal animal) throws Exception{
		if(animal.getNumber()==Cat.number) {
			System.out.println("录入成功");
		}else if(animal.getNumber()==Penguin.number) {
			System.out.println("录入成功");
		}else if(animal.getNumber()==Fish.number) {
			System.out.println("录入成功");
		}else {
			throw new AnimalException("腿数出错");
		}
	}
}

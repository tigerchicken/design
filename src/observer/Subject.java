package observer;

public interface Subject {
	//注册或删除观察者
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	//当主题状态变化时，通知所有的观察者
	public void notifyObserver();
}

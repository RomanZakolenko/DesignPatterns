package behavioral.observer;

public interface SubjectInterface {
	void addObserver(ObserverInterface obs);

	void removeObserver(ObserverInterface obs);

	void update();
}

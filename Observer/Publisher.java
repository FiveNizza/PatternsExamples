package by.Prohorov.Observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements ISubscrib {

    private List<ISubscriber> ISubscribers;
    private Magazine newMagazine;

    Publisher() {
        this.ISubscribers = new ArrayList<ISubscriber>();
    }

    public void publishMagazines() {
        this.newMagazine = new Magazine();
        magazinePublished();
    }

    private void magazinePublished() {
        notifyAllSubscribers();
    }

    @Override
    public void subscribe(ISubscriber ISubscriber) {
        ISubscribers.add(ISubscriber);
    }

    @Override
    public void unsubscribe(ISubscriber ISubscriber) {
        int index = ISubscribers.indexOf(ISubscriber);
        if (index >= 0) {
            ISubscribers.remove(index);
        }
    }

    @Override
    public void notifyAllSubscribers() {
        for (ISubscriber ISubscriber : ISubscribers) {
            ISubscriber.add(newMagazine);
        }
    }
}

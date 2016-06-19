package by.Prohorov.Observer;

public interface ISubscrib {
    //Подписаться
    void subscribe(ISubscriber ISubscriber);
    //Отписаться
    void unsubscribe(ISubscriber ISubscriber);
    //Уведомить подписчиков
    void notifyAllSubscribers();
}

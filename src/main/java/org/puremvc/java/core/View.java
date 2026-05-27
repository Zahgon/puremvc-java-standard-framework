//
//  PureMVC Java Standard
//
//  Copyright(c) 2019 Saad Shams <saad.shams@puremvc.org>
//  Your reuse is governed by the Creative Commons Attribution 3.0 License
//
package org.puremvc.java.core;

import org.puremvc.java.interfaces.IMediator;
import org.puremvc.java.interfaces.INotification;
import org.puremvc.java.interfaces.IObserver;
import org.puremvc.java.interfaces.IView;
import org.puremvc.java.patterns.observer.Observer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Supplier;

/**
 * <P>A Singleton <code>IView</code> implementation.</P>
 *
 * <P>In PureMVC, the <code>View</code> class assumes these responsibilities:</P>
 *
 * <UL>
 * <LI>Maintain a cache of <code>IMediator</code> instances.</LI>
 * <LI>Provide methods for registering, retrieving, and removing <code>IMediators</code>.</LI>
 * <LI>Notifiying <code>IMediators</code> when they are registered or removed.</LI>
 * <LI>Managing the observer lists for each <code>INotification</code> in the application.</LI>
 * <LI>Providing a method for attaching <code>IObservers</code> to an <code>INotification</code>'s observer list.</LI>
 * <LI>Providing a method for broadcasting an <code>INotification</code>.</LI>
 * <LI>Notifying the <code>IObservers</code> of a given <code>INotification</code> when it broadcast.</LI>
 * </UL>
 *
 * @see org.puremvc.java.patterns.mediator.Mediator Mediator
 * @see org.puremvc.java.patterns.observer.Observer Observer
 * @see org.puremvc.java.patterns.observer.Notification Notification
 */
public class View implements IView {

    // Mapping of Mediator names to Mediator instances
    protected ConcurrentMap<String, IMediator> mediatorMap;

    // Mapping of Notification names to Observer lists
    protected ConcurrentMap<String, List<IObserver>> observerMap;

    // Singleton instance
    protected static IView instance;

    // Message Constants
    protected final String SINGLETON_MSG = "View Singleton already constructed!";

    /**
     * <P>Constructor.</P>
     *
     * <P>This <code>IView</code> implementation is a Singleton,
     * so you should not call the constructor
     * directly, but instead call the static Singleton
     * Factory method <code>View.getInstance()</code></P>
     *
     * @throws Error Error if Singleton instance has already been constructed
     */
    public View() {
        if (instance != null)
            new Error(SINGLETON_MSG);
        instance = this;
        mediatorMap = new ConcurrentHashMap<>();
        observerMap = new ConcurrentHashMap<>();
        initializeView();
    }

    /**
     * <P>View Singleton Factory method.</P>
     *
     * @param factory view supplier function
     * @return the Singleton instance of <code>View</code>
     */
    public synchronized static IView getInstance(Supplier<IView> factory) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * <P>Initialize the Singleton View instance.</P>
     *
     * <P>Called automatically by the constructor, this
     * is your opportunity to initialize the Singleton
     * instance in your subclass without overriding the
     * constructor.</P>
     */
    protected void initializeView() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * <P>Register an <code>IObserver</code> to be notified
     * of <code>INotifications</code> with a given name.</P>
     *
     * @param notificationName the name of the <code>INotifications</code> to notify this <code>IObserver</code> of
     * @param observer the <code>IObserver</code> to register
     */
    public void registerObserver(String notificationName, IObserver observer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * <P>Notify the <code>IObservers</code> for a particular <code>INotification</code>.</P>
     *
     * <P>All previously attached <code>IObservers</code> for this <code>INotification</code>'s
     * list are notified and are passed a reference to the <code>INotification</code> in
     * the order in which they were registered.</P>
     *
     * @param notification the <code>INotification</code> to notify <code>IObservers</code> of.
     */
    public void notifyObservers(INotification notification) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * <P>Remove the observer for a given notifyContext from an observer list for a given Notification name.</P>
     *
     * @param notificationName which observer list to remove from
     * @param notifyContext remove the observer with this object as its notifyContext
     */
    public void removeObserver(String notificationName, Object notifyContext) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * <P>Register an <code>IMediator</code> instance with the <code>View</code>.</P>
     *
     * <P>Registers the <code>IMediator</code> so that it can be retrieved by name,
     * and further interrogates the <code>IMediator</code> for its
     * <code>INotification</code> interests.</P>
     *
     * <P>If the <code>IMediator</code> returns any <code>INotification</code>
     * names to be notified about, an <code>Observer</code> is created encapsulating
     * the <code>IMediator</code> instance's <code>handleNotification</code> method
     * and registering it as an <code>Observer</code> for all <code>INotifications</code> the
     * <code>IMediator</code> is interested in.</P>
     *
     * @param mediator a reference to the <code>IMediator</code> instance
     */
    public void registerMediator(IMediator mediator) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * <P>Retrieve an <code>IMediator</code> from the <code>View</code>.</P>
     *
     * @param mediatorName the name of the <code>IMediator</code> instance to retrieve.
     * @return the <code>IMediator</code> instance previously registered with the given <code>mediatorName</code>.
     */
    public IMediator retrieveMediator(String mediatorName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * <P>Remove an <code>IMediator</code> from the <code>View</code>.</P>
     *
     * @param mediatorName name of the <code>IMediator</code> instance to be removed.
     * @return the <code>IMediator</code> that was removed from the <code>View</code>
     */
    public IMediator removeMediator(String mediatorName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * <P>Check if a Mediator is registered or not</P>
     *
     * @param mediatorName mediator name
     * @return whether a Mediator is registered with the given <code>mediatorName</code>.
     */
    public boolean hasMediator(String mediatorName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

package LgkBase.view;

import LgkBase.presenter.Presenter;

import java.util.Date;

/**
 * Created by user on 16.03.2016.
 */
public interface CalendarView {
    void setStartDate(Date start);
    void setEndDate(Date end);
    boolean isHideWeekends();
    void setFirstVisibleDayOfWeek(int firstDay);
    void setLastVisibleDayOfWeek(int lastDay);
    void setFirstVisibleHourOfDay(int firstHour);
    void setLastVisibleHourOfDay(int lastHour);
    String getFirstHourOfDay();
    String getLastHourOfDay();
    void setDateNewEvent(Date start, Date end);
    void setEditFormPresenter(Presenter presenter);
}
package lib.keyword;

/**
 * Created by albert on 11/03/2017.
 */
public interface HomePageInterface {

    /*
    * Open the borwser, default with chrome
    *
    * */
    public void Open_Browser(String locator, String path, String url);
    /*
    * click the vertical firght ticket tab on the left side
    *
    * */
    public void Select_FlightTicketTab(String locator, String path, String param);

    /*
    * click the horizential domestic flight ticket tab
    *
    * */
    public void Select_DomesticFlightTab(String locator, String path, String param);

    public void Select_RoundTripRadioButton(String locator, String path, String param);

    public void Edit_TravelFromText(String locator, String path, String text);

    public void Edit_TravelToText(String locator, String path, String text);

    public void Edit_DateFromText(String locator, String path, String date);

    public void Edit_DateToText(String locator, String path, String date);

    public void Click_SearchButton(String locator, String path, String param);
}

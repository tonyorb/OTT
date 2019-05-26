
package ru.gorbunov;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
    "id",
    "city_id",
    "timezone",
    "timezone_gmt",
    "name",
    "name_orig",
    "name_ascii",
    "city_slug",
    "lat",
    "lng",
    "hotels",
    "population",
    "fcode",
    "type",
    "country_code",
    "country_slug",
    "currency",
    "stars",
    "country",
    "admin1code",
    "admin2code",
    "map_view",
    "city_img",
    "src",
    "rel",
    "iata",
    "fr_stars",
    "type_id",
    "city_name_ascii",
    "city_name",
    "state",
    "city_iata",
    "city"
})
public class Result {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("city_id")
    private Integer cityId;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("timezone_gmt")
    private Integer timezoneGmt;
    @JsonProperty("name")
    private String name;
    @JsonProperty("name_orig")
    private String nameOrig;
    @JsonProperty("name_ascii")
    private String nameAscii;
    @JsonProperty("city_slug")
    private String citySlug;
    @JsonProperty("lat")
    private Double lat;
    @JsonProperty("lng")
    private Double lng;
    @JsonProperty("hotels")
    private Integer hotels;
    @JsonProperty("population")
    private Integer population;
    @JsonProperty("fcode")
    private String fcode;
    @JsonProperty("type")
    private String type;
    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("country_slug")
    private String countrySlug;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("stars")
    private String stars;
    @JsonProperty("country")
    private String country;
    @JsonProperty("admin1code")
    private Object admin1code;
    @JsonProperty("admin2code")
    private Object admin2code;
    @JsonProperty("map_view")
    private List<Double> mapView = null;
    @JsonProperty("city_img")
    private String cityImg;
    @JsonProperty("src")
    private String src;
    @JsonProperty("rel")
    private Integer rel;
    @JsonProperty("iata")
    private String iata;
    @JsonProperty("fr_stars")
    private Object frStars;
    @JsonProperty("type_id")
    private Integer typeId;
    @JsonProperty("city_name_ascii")
    private String cityNameAscii;
    @JsonProperty("city_name")
    private String cityName;
    @JsonProperty("state")
    private Object state;
    @JsonProperty("city_iata")
    private String cityIata;
    @JsonProperty("city")
    private String city;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("city_id")
    public Integer getCityId() {
        return cityId;
    }

    @JsonProperty("city_id")
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @JsonProperty("timezone_gmt")
    public Integer getTimezoneGmt() {
        return timezoneGmt;
    }

    @JsonProperty("timezone_gmt")
    public void setTimezoneGmt(Integer timezoneGmt) {
        this.timezoneGmt = timezoneGmt;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("name_orig")
    public String getNameOrig() {
        return nameOrig;
    }

    @JsonProperty("name_orig")
    public void setNameOrig(String nameOrig) {
        this.nameOrig = nameOrig;
    }

    @JsonProperty("name_ascii")
    public String getNameAscii() {
        return nameAscii;
    }

    @JsonProperty("name_ascii")
    public void setNameAscii(String nameAscii) {
        this.nameAscii = nameAscii;
    }

    @JsonProperty("city_slug")
    public String getCitySlug() {
        return citySlug;
    }

    @JsonProperty("city_slug")
    public void setCitySlug(String citySlug) {
        this.citySlug = citySlug;
    }

    @JsonProperty("lat")
    public Double getLat() {
        return lat;
    }

    @JsonProperty("lat")
    public void setLat(Double lat) {
        this.lat = lat;
    }

    @JsonProperty("lng")
    public Double getLng() {
        return lng;
    }

    @JsonProperty("lng")
    public void setLng(Double lng) {
        this.lng = lng;
    }

    @JsonProperty("hotels")
    public Integer getHotels() {
        return hotels;
    }

    @JsonProperty("hotels")
    public void setHotels(Integer hotels) {
        this.hotels = hotels;
    }

    @JsonProperty("population")
    public Integer getPopulation() {
        return population;
    }

    @JsonProperty("population")
    public void setPopulation(Integer population) {
        this.population = population;
    }

    @JsonProperty("fcode")
    public String getFcode() {
        return fcode;
    }

    @JsonProperty("fcode")
    public void setFcode(String fcode) {
        this.fcode = fcode;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("country_slug")
    public String getCountrySlug() {
        return countrySlug;
    }

    @JsonProperty("country_slug")
    public void setCountrySlug(String countrySlug) {
        this.countrySlug = countrySlug;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("stars")
    public String getStars() {
        return stars;
    }

    @JsonProperty("stars")
    public void setStars(String stars) {
        this.stars = stars;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("admin1code")
    public Object getAdmin1code() {
        return admin1code;
    }

    @JsonProperty("admin1code")
    public void setAdmin1code(Object admin1code) {
        this.admin1code = admin1code;
    }

    @JsonProperty("admin2code")
    public Object getAdmin2code() {
        return admin2code;
    }

    @JsonProperty("admin2code")
    public void setAdmin2code(Object admin2code) {
        this.admin2code = admin2code;
    }

    @JsonProperty("map_view")
    public List<Double> getMapView() {
        return mapView;
    }

    @JsonProperty("map_view")
    public void setMapView(List<Double> mapView) {
        this.mapView = mapView;
    }

    @JsonProperty("city_img")
    public String getCityImg() {
        return cityImg;
    }

    @JsonProperty("city_img")
    public void setCityImg(String cityImg) {
        this.cityImg = cityImg;
    }

    @JsonProperty("src")
    public String getSrc() {
        return src;
    }

    @JsonProperty("src")
    public void setSrc(String src) {
        this.src = src;
    }

    @JsonProperty("rel")
    public Integer getRel() {
        return rel;
    }

    @JsonProperty("rel")
    public void setRel(Integer rel) {
        this.rel = rel;
    }

    @JsonProperty("iata")
    public String getIata() {
        return iata;
    }

    @JsonProperty("iata")
    public void setIata(String iata) {
        this.iata = iata;
    }

    @JsonProperty("fr_stars")
    public Object getFrStars() {
        return frStars;
    }

    @JsonProperty("fr_stars")
    public void setFrStars(Object frStars) {
        this.frStars = frStars;
    }

    @JsonProperty("type_id")
    public Integer getTypeId() {
        return typeId;
    }

    @JsonProperty("type_id")
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    @JsonProperty("city_name_ascii")
    public String getCityNameAscii() {
        return cityNameAscii;
    }

    @JsonProperty("city_name_ascii")
    public void setCityNameAscii(String cityNameAscii) {
        this.cityNameAscii = cityNameAscii;
    }

    @JsonProperty("city_name")
    public String getCityName() {
        return cityName;
    }

    @JsonProperty("city_name")
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @JsonProperty("state")
    public Object getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(Object state) {
        this.state = state;
    }

    @JsonProperty("city_iata")
    public String getCityIata() {
        return cityIata;
    }

    @JsonProperty("city_iata")
    public void setCityIata(String cityIata) {
        this.cityIata = cityIata;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

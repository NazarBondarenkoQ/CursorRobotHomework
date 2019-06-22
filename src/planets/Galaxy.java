package planets;

public class Galaxy {
    private final HotPlanet hotPlanet = new HotPlanet();
    private final OceanPlanet oceanPlanet = new OceanPlanet();
    private final WindPlanet windPlanet = new WindPlanet();

    public HotPlanet getHotPlanet() {
        return hotPlanet;
    }

    public OceanPlanet getOceanPlanet() {
        return oceanPlanet;
    }

    public WindPlanet getWindPlanet() {
        return windPlanet;
    }
}

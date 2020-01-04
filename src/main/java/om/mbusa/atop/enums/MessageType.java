package om.mbusa.atop.enums;

public enum MessageType {
	STOP_ETA_UPDATED("STOP_ETA_UPDATED"),
	LOCATION_UPDATE("LOCATION_UPDATE"),
	STOP_ARRIVAL("STOP_ARRIVAL"),
	PARCEL_UPDATE("PARCEL_UPDATE");
	
	public final String label;
	
	private MessageType() {
		this.label = null;
    }
	 
    private MessageType(String label) {
        this.label = label;
    }
}

package caveExplorer;

public class InventoryNockles {

	private boolean hasMap;
	private String map;
	
	public InventoryNockles(pd8CaveRoom[][] caves) {
		hasMap = true;
		updateMap();
		
	}

	private void updateMap() {
		pd8CaveRoom[][] caves =  caveExplorer.caves;
	}

	public String getDescription() {
		if (hasMap) return map;
		else return "You have no inventory";
	}

}

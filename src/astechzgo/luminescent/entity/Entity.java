package astechzgo.luminescent.entity;

import astechzgo.luminescent.coordinates.GameCoordinates;
import astechzgo.luminescent.rendering.IObjectRenderer;

public interface Entity {

	default public void render() {
		updateRenderer();
		getRenderer().render();
	}
	
	public IObjectRenderer getRenderer();
	
	public void updateRenderer();
	
	public GameCoordinates getCoordinates();
}

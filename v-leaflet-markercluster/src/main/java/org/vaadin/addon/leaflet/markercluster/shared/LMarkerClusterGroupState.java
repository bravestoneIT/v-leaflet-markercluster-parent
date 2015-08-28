package org.vaadin.addon.leaflet.markercluster.shared;

import org.vaadin.addon.leaflet.shared.LeafletLayerGroupState;

public class LMarkerClusterGroupState  extends LeafletLayerGroupState {

	public Integer maxClusterRadius;
	public Boolean spiderfyOnMaxZoom;
	public Boolean showCoverageOnHover;
	public Boolean zoomToBoundsOnClick;
	public Boolean singleMarkerMode;
	public Integer disableClusteringAtZoom;
	public Boolean removeOutsideVisibleBounds;
	public Boolean animateAddingMarkers;
	public Integer spiderfyDistanceMultiplier;
	public Boolean chunkedLoading;
	public Integer chunkInterval;
	public Integer chunkDelay;
}

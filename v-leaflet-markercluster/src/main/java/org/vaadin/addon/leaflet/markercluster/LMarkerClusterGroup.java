package org.vaadin.addon.leaflet.markercluster;

import org.vaadin.addon.leaflet.LFeatureGroup;
import org.vaadin.addon.leaflet.markercluster.shared.LMarkerClusterGroupState;

/**
 * 
 */
public class LMarkerClusterGroup extends LFeatureGroup {
	

	@Override
	protected LMarkerClusterGroupState getState() {
		// TODO Auto-generated method stub
		return (LMarkerClusterGroupState) super.getState();
	}
	
	@Override
	protected LMarkerClusterGroupState getState(boolean markAsDirty) {
		// TODO Auto-generated method stub
		return (LMarkerClusterGroupState) super.getState(markAsDirty);
	}
	
	/**
	 * this only takes effect before this layer gets added to the map
	 * @param maxClusterRadius
	 * @return this
	 */
	public LMarkerClusterGroup setMaxClusterRadius(int maxClusterRadius) {
		getState().maxClusterRadius = maxClusterRadius;
		return this;
	}
	
	/**
	 * this only takes effect before this layer gets added to the map
	 * @param spiderfyOnMaxZoom
	 * @return this
	 */
	public LMarkerClusterGroup setSpiderfyOnMaxZoom(boolean spiderfyOnMaxZoom) {
		getState().spiderfyOnMaxZoom = spiderfyOnMaxZoom;
		return this;
	}
	
	/**
	 * this only takes effect before this layer gets added to the map
	 * @param showCoverageOnHover
	 * @return this
	 */
	public LMarkerClusterGroup setShowCoverageOnHover(boolean showCoverageOnHover) {
		getState().showCoverageOnHover = showCoverageOnHover;
		return this;
	}
	
	/**
	 * this only takes effect before this layer gets added to the map
	 * @param zoomToBoundsOnClick
	 * @return this
	 */
	public LMarkerClusterGroup setZoomToBoundsOnClick(boolean zoomToBoundsOnClick) {
		getState().zoomToBoundsOnClick = zoomToBoundsOnClick;
		return this;
	}
	
	/**
	 * this only takes effect before this layer gets added to the map
	 * @param singleMarkerMode
	 * @return this
	 */
	public LMarkerClusterGroup setSingleMarkerMode(boolean singleMarkerMode) {
		getState().singleMarkerMode = singleMarkerMode;
		return this;
	}
	
	/**
	 * this only takes effect before this layer gets added to the map
	 * @param disableClusteringAtZoom
	 * @return this
	 */
	public LMarkerClusterGroup setDisableClusteringAtZoom(int disableClusteringAtZoom) {
		getState().disableClusteringAtZoom = disableClusteringAtZoom;
		return this;
	}
	
	/**
	 * this only takes effect before this layer gets added to the map
	 * @param removeOutsideVisibleBounds
	 * @return this
	 */
	public LMarkerClusterGroup setRemoveOutsideVisibleBounds(boolean removeOutsideVisibleBounds) {
		getState().removeOutsideVisibleBounds = removeOutsideVisibleBounds;
		return this;
	}
	
	/**
	 * this only takes effect before this layer gets added to the map
	 * @param animateAddingMarkers
	 * @return this
	 */
	public LMarkerClusterGroup setAnimateAddingMarkers(boolean animateAddingMarkers) {
		getState().animateAddingMarkers = animateAddingMarkers;
		return this;
	}
	
	/**
	 * this only takes effect before this layer gets added to the map
	 * @param spiderfyDistanceMultiplier
	 * @return this
	 */
	public LMarkerClusterGroup setSpiderfyDistanceMultiplier(int spiderfyDistanceMultiplier) {
		getState().spiderfyDistanceMultiplier = spiderfyDistanceMultiplier;
		return this;
	}
	
	/**
	 * this only takes effect before this layer gets added to the map
	 * @param chunkedLoading
	 * @return this
	 */
	public LMarkerClusterGroup setChunkedLoading(boolean chunkedLoading) {
		getState().chunkedLoading = chunkedLoading;
		return this;
	}
	
	/**
	 * this only takes effect before this layer gets added to the map
	 * @param chunkInterval
	 * @return
	 */
	public LMarkerClusterGroup setChunkInterval(int chunkInterval) {
		getState().chunkInterval = chunkInterval;
		return this;
	}
	
	/**
	 * this only takes effect before this layer gets added to the map
	 * @param chunkDelay
	 * @return this
	 */
	public LMarkerClusterGroup setChunkDelay(int chunkDelay) {
		getState().chunkDelay = chunkDelay;
		return this;
	}
}

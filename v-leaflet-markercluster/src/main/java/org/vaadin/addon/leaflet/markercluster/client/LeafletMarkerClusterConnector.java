package org.vaadin.addon.leaflet.markercluster.client;

import java.util.logging.Logger;

import org.peimari.gleaflet.client.LayerGroup;
import org.vaadin.addon.leaflet.client.LeafletFeatureGroupConnector;
import org.vaadin.addon.leaflet.markercluster.LMarkerClusterGroup;
import org.vaadin.addon.leaflet.markercluster.shared.LMarkerClusterGroupState;
import org.vaadin.gleaflet.markercluster.client.MarkerClusterGroup;
import org.vaadin.gleaflet.markercluster.client.MarkerClusterGroupOptions;

import com.vaadin.shared.ui.Connect;

@Connect(LMarkerClusterGroup.class)
public class LeafletMarkerClusterConnector extends LeafletFeatureGroupConnector {


	/**
	 * 
	 */
	private static final long serialVersionUID = -7629269384070668494L;
	
	
	public LeafletMarkerClusterConnector() {
		System.out.println("##################################### this is madness");
	}

	@Override
	public LMarkerClusterGroupState getState() {
		// TODO Auto-generated method stub
		return (LMarkerClusterGroupState) super.getState();
	}

	@Override
	protected LayerGroup createLayerGroup() {
		MarkerClusterGroupOptions options = MarkerClusterGroupOptions.create();

		LMarkerClusterGroupState state = getState();
		
		if (state.maxClusterRadius != null)
			options.setMaxClusterRadius(state.maxClusterRadius);
		
		if (state.spiderfyOnMaxZoom != null)
			options.setSpiderfyOnMaxZoom(state.spiderfyOnMaxZoom);
		
		if (state.showCoverageOnHover != null)
			options.setShowCoverageOnHover(state.showCoverageOnHover);
		
		if (state.zoomToBoundsOnClick != null)
			options.setZoomToBoundsOnClick(state.zoomToBoundsOnClick);
		
		if (state.singleMarkerMode != null)
			options.setSingleMarkerMode(state.singleMarkerMode);
		
		if (state.disableClusteringAtZoom != null)
			options.setDisableClusteringAtZoom(state.disableClusteringAtZoom);
		
		if (state.removeOutsideVisibleBounds != null)
			options.setRemoveOutsideVisibleBounds(state.removeOutsideVisibleBounds);
		
		if (state.animateAddingMarkers != null)
			options.setAnimateAddingMarkers(state.animateAddingMarkers);
		
		if (state.spiderfyDistanceMultiplier != null)
			options.setSpiderfyDistanceMultiplier(state.spiderfyDistanceMultiplier);
		
		if (state.chunkedLoading != null) {
			Logger.getGlobal().severe("##################################### set chuncked loading option");
			options.setChunkedLoading(state.chunkedLoading);
		}
		
		if (state.chunkInterval != null)
			Logger.getGlobal().severe("##################################### set chuncked interval option");
			options.setChunkInterval(state.chunkInterval);
		
		if (state.chunkDelay != null)
			Logger.getGlobal().severe("##################################### set chuncked delay option");
			options.setChunkDelay(state.chunkDelay);
		
		Logger.getGlobal().severe("##################################### create with options");

		return MarkerClusterGroup.create(options);
	}

}
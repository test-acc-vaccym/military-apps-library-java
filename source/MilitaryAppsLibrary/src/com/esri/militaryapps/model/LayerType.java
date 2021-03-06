/*******************************************************************************
 * Copyright 2013-2014 Esri
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 *  
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 ******************************************************************************/
package com.esri.militaryapps.model;

import java.io.Serializable;

/**
 * An enum of layer types. Not all of these types are supported in every ArcGIS SDK.
 */
public enum LayerType implements Serializable {
    
    TILED_CACHE,
    TILED_MAP_SERVICE,
    LOCAL_DYNAMIC_MAP,
    DYNAMIC_MAP_SERVICE,
    MIL2525C_MESSAGE,
    IMAGE_SERVICE,
    FEATURE_SERVICE,
    SHAPEFILE,
    GEOPACKAGE
}

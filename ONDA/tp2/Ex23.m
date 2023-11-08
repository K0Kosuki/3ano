wviewer = siteviewer("SceneModel","office.stl","ShowOrigin",false);
tx = txsite("cartesian","AntennaPosition",[2; 1.3; 2.5]);
tx.TransmitterPower = 1;
rx_desk = rxsite("cartesian","AntennaPosition",[3.6; 7.5; 1]);
rx_shelf = rxsite("cartesian","AntennaPosition",[0.4; 3.3; 1]);
los(tx,[rx_desk rx_shelf])
clearMap(viewer)
tx.TransmitterFrequency=5e9;
pm = propagationModel("raytracing", "CoordinateSystem","cartesian","SurfaceMaterial","wood", "BuildingsMaterial", "wood", "MaxNumReflections", 1);
raytrace(tx,[rx_desk rx_shelf],pm)

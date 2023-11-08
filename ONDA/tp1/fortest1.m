viewer = siteviewer("SceneModel","office.stl","ShowOrigin",false);
tx = txsite("cartesian","AntennaPosition",[1.5; 3; 3]);
tx.TransmitterPower = 1;

rx_desk = rxsite("cartesian","AntennaPosition",[3.6; 7.5; 1]);
rx_shelf = rxsite("cartesian","AntennaPosition",[0.4; 4.6; 1.6]);
rx_3 = rxsite("cartesian","AntennaPosition",[2.5; 1; 0.6]);

los(tx,[rx_desk rx_shelf rx_3] )
tx.TransmitterFrequency=100e6 ;
pm = propagationModel("raytracing", "CoordinateSystem","cartesian","SurfaceMaterial","glass", "BuildingsMaterial", "glass", "MaxNumReflections", 3);
raytrace(tx,[rx_desk rx_shelf rx_3],pm)


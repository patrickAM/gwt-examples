package org.gonevertical.core.client.account.thing.ownership;

import org.gonevertical.core.client.admin.thingset.ThingSetOfData;

import com.google.gwt.user.client.rpc.IsSerializable;

public class ThingLinksData implements IsSerializable {

  public int total = 0;
  
  public ThingSetOfData[] thingSetData = null;
  
}
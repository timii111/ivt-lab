package hu.bme.mit.spaceship;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

public class GT4500Test {

  private GT4500 ship;
  private TorpedoStore mockStr1;
    private TorpedoStore mockStr2;

  @Before
  public void init(){

    mockStr1 = mock(TorpedoStore.class);
      mockStr2 = mock(TorpedoStore.class);
    this.ship = new GT4500(mockStr1, mockStr2);

  }

  @Test
  public void fireTorpedo_Single_Success(){

      when(mockStr1.fire(1)).thenReturn(true);
      ship.fireTorpedo(FiringMode.SINGLE);

      verify(mockStr1, times(1)).fire(1);
    
  }

  @Test
  public void fireTorpedo_All_Success() {
      // Arrange
      when(mockStr1.fire(1)).thenReturn(true);
      ship.fireTorpedo(FiringMode.ALL);

      verify(mockStr1, times(1)).fire(1);
  }

}

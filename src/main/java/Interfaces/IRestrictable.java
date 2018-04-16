package Interfaces;

import ThemePark.Visitor;

public interface IRestrictable {
   public boolean isAllowed (Visitor visitor);
}

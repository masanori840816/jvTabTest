package data;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Checker {
  String _strRegEx = "^[0-9]+$";
  Pattern _ptnPattern;
  Matcher _mtcMatcher;

  public boolean checkPageNum(String strPageNum){
    _ptnPattern = Pattern.compile(_strRegEx);
    _mtcMatcher = _ptnPattern.matcher(strPageNum);

    return _mtcMatcher.find();
  }
}

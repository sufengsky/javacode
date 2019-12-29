package com.dao;

import com.core.BasetableFactory;
import com.core.DataBase;
import com.core.FinalConstants;
import com.model.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;

public class DbBasetableFactory extends BasetableFactory {

    public int getRow(String sql) {
        return DataBase.getRow(sql);
    }

    //user  用户管理
    public boolean CreatUser(HttpServletRequest request) {
        return (new Dbuser(request)).Insert();
    }
    public boolean DeleteUser(String sql) {
        return DataBase.Delete(FinalConstants.DELETE_USER + sql);
    }
    public User SearchUser(String sql) {
        return new Dbuser().Dbusers(sql);
    }
    public Collection ListUser(int page, String sql) {
        return new Dbuser().Select(page, sql);
    }

    //select 选择题
    public boolean CreatSelect(HttpServletRequest request) {
        return (new Dbselect(request)).Insert();
    }
    public boolean DeleteSelect(String sql) {
        return DataBase.Delete(FinalConstants.DELETE_SELECT + sql);
    }
    public Select SearchSelect(String sql) {
        return new Dbselect().Dbselects(sql);
    }
    public Collection ListSelect(int page, String sql) {
        return new Dbselect().Select(page, sql);
    }
    public Collection ListSelect_r(int page, String sql) {
        return new Dbselect().Select_r(page, sql);
    }

    //blank 填空题
    public boolean CreatBlank(HttpServletRequest request) {
        return (new Dbblank(request)).Insert();
    }
    public boolean DeleteBlank(String sql) {
        return DataBase.Delete(FinalConstants.DELETE_BLANK + sql);
    }
    public Blank SearchBlank(String sql) {
        return new Dbblank().Dbblanks(sql);
    }
    public Collection ListBlank(int page, String sql) {
        return new Dbblank().Blank(page, sql);
    }

    //paper 试卷
    public boolean CreatPaper(HttpServletRequest request) {
        return (new Dbpaper(request)).Insert();
    }
    public boolean UpdatePaper(HttpServletRequest request) {
        return (new Dbpaper(request).Update());
    }
    public Paper SearchPaper(String sql) {
        return new Dbpaper().Dbpapers(sql);
    }

    //selectchp
    public boolean CreatSelectChp(HttpServletRequest request) {
        return (new Dbselectchp(request)).Insert();
    }
    public boolean DeleteSelectChp(String sql) {
        return DataBase.Delete(FinalConstants.DELETE_SELECTCHP + sql);
    }
    public SelectChp SearchSelectChp(String sql) {
        return new Dbselectchp().Dbselectchps(sql);
    }
    public Collection ListSelectChp(int page, String sql) {
        return new Dbselectchp().Select(page, sql);
    }

    //blankchp
    public boolean CreatBlankChp(HttpServletRequest request) {
        return (new Dbblankchp(request)).Insert();
    }
    public boolean DeleteBlankChp(String sql) {
        return DataBase.Delete(FinalConstants.DELETE_BLANKCHP + sql);
    }
    public BlankChp SearchBlankChp(String sql) {
        return new Dbblankchp().Dbblankchps(sql);
    }
    public Collection ListBlankChp(int page, String sql) {
        return new Dbblankchp().BlankChp(page, sql);
    }

    //selectdiff
    public boolean CreatSelectDiff(HttpServletRequest request) {
        return (new Dbselectdiff(request)).Insert();
    }
    public boolean DeleteSelectDiff(String sql) {
        return DataBase.Delete(FinalConstants.DELETE_SELECTDIFF + sql);
    }
    public SelectDiff SearchSelectDiff(String sql) {
        return new Dbselectdiff().Dbselectdiffs(sql);
    }
    public Collection ListSelectDiff(int page, String sql) {
        return new Dbselectdiff().Select(page, sql);
    }

    //blankdiff
    public boolean CreatBlankDiff(HttpServletRequest request) {
        return (new Dbblankdiff(request)).Insert();
    }
    public boolean DeleteBlankDiff(String sql) {
        return DataBase.Delete(FinalConstants.DELETE_BLANKDIFF + sql);
    }
    public Collection ListBlankDiff(int page, String sql) {
        return new Dbblankdiff().BlankDiff(page, sql);
    }
    public BlankDiff SearchBlankDiff(String sql) {
        return new Dbblankdiff().Dbblankdiffs(sql);
    }
}

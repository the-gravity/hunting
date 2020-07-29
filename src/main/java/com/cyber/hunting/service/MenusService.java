package com.cyber.hunting.service;

import com.cyber.hunting.entity.Menus;
import com.cyber.hunting.repository.MenusRepository;
import com.cyber.hunting.vo.MenusVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenusService {
    @Autowired
    MenusRepository menusRepository;

    /**
     * 获取导航栏
     */
    public List<MenusVo> listMenus(){
        List<Menus> menuList = menusRepository.findAll();
        List<MenusVo> menus = new ArrayList<>();

        for (int i = 0;i<menuList.size();i++){
            if (menuList.get(i).getParentid()==0){
                MenusVo menusVo = new MenusVo();
                menusVo.setId(menuList.get(i).getId());
                menusVo.setName(menuList.get(i).getName());
                menusVo.setPath(menuList.get(i).getPath());
                menus.add(menusVo);
            }
        }

        for (int i = 0;i<menus.size();i++){
            ArrayList<MenusVo> voArrayList = new ArrayList<>();

            for (int j = 0;j<menuList.size();j++){
                if (menuList.get(j).getParentid()==0) continue;
                if (menus.get(i).getId() == (menuList.get(j).getParentid())){
                    MenusVo menusVo = new MenusVo();
                    menusVo.setId(menuList.get(j).getId());
                    menusVo.setName(menuList.get(j).getName());
                    menusVo.setPath(menuList.get(j).getPath());
                    voArrayList.add(menusVo);
                    menus.get(i).setChildren(voArrayList);
                }
            }

        }
        return menus;
    }
}

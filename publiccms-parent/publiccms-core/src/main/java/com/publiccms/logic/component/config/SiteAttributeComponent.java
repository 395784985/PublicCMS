package com.publiccms.logic.component.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Component;

import com.publiccms.common.api.Config;
import com.publiccms.common.constants.CommonConstants;
import com.publiccms.entities.sys.SysSite;
import com.publiccms.views.pojo.entities.ExtendField;

/**
 * 
 * SiteAttributeComponent 站点扩展属性组件
 *
 */
@Component
public class SiteAttributeComponent implements Config {
    public static final String CONFIG_LOGO = "logo";
    /**
     * 
     */
    public static final String CONFIG_CODE_DESCRIPTION = CONFIGPREFIX + CONFIG_CODE_SITEA_TTRIBUTE;

    @Override
    public String getCode(SysSite site, boolean showAll) {
        return CONFIG_CODE_SITEA_TTRIBUTE;
    }

    @Override
    public String getCodeDescription(Locale locale) {
        return getMessage(locale, CONFIG_CODE_DESCRIPTION);
    }

    @Override
    public List<ExtendField> getExtendFieldList(SysSite site, Locale locale) {
        List<ExtendField> extendFieldList = new ArrayList<>();
        extendFieldList.add(new ExtendField(CONFIG_LOGO, INPUTTYPE_IMAGE, false,
                getMessage(locale, CONFIG_CODE_DESCRIPTION + CommonConstants.DOT + CONFIG_LOGO),
                getMessage(locale, CONFIG_CODE_DESCRIPTION + CommonConstants.DOT + CONFIG_LOGO + CONFIG_CODE_DESCRIPTION_SUFFIX),
                null));
        return extendFieldList;
    }
}
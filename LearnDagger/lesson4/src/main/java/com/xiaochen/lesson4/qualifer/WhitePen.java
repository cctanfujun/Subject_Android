package com.xiaochen.lesson4.qualifer;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by tanfujun on 11/10/16.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface WhitePen {
}

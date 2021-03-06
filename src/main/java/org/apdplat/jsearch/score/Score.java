/*
 * APDPlat - Application Product Development Platform
 * Copyright (c) 2013, 杨尚川, yang-shangchuan@qq.com
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.apdplat.jsearch.score;

import org.apdplat.jsearch.search.Doc;

import java.util.List;

/**
 * 评分接口
 * @author 杨尚川
 */
@FunctionalInterface
public interface Score {
    /**
     * 文档评分
     * @param doc 文档
     * @param words 分好词的查询关键词
     * @return 分值
     */
    public Float score(Doc doc, List<String> words);
}

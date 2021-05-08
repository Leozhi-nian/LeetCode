package com.leozhi.topic1723

/**
 * @author leozhi
 * 深度优先搜索
 * 通过
 * 236ms
 */
class Solution01 {
    var res = 0x3f3f3f3f
    var len = 0
    var count = 0
    fun minimumTimeRequired(jobs: IntArray, k: Int): Int {
        len = jobs.size
        count = k
        if (len == k) {
            return jobs.maxOrNull() ?: 0
        }
        val duration = IntArray(k)
        dfs(0, 0, duration, 0, jobs)
        return res
    }

    /**
     * 深度优先搜索
     * @author leozhi
     * @param job 当前要分配的工作编号
     * @param hasJob 当前已经分配过工作的工人数
     * @param jobDuration 工人工作时长，例如 sum[0] = x 表示0号工人共分配了x时长的工作
     * @param max 当前的最大工作时间
     * @param jobs 工作
     */
    private fun dfs(job: Int, hasJob: Int, jobDuration: IntArray, max: Int, jobs: IntArray) {
        if (max >= res) return
        if (job == len) {
            res = max
            return
        }
        // 优先分配给空闲工人
        if (hasJob < count) {
            jobDuration[hasJob] = jobs[job]
            dfs(job + 1, hasJob + 1, jobDuration, if (jobDuration[hasJob] > max) jobDuration[hasJob] else max, jobs)
            jobDuration[hasJob] = 0
        }
        for (i in 0 until hasJob) {
            jobDuration[i] += jobs[job]
            dfs(job + 1, hasJob, jobDuration, if (jobDuration[i] > max) jobDuration[i] else max, jobs)
            jobDuration[i] -= jobs[job]
        }
    }
}